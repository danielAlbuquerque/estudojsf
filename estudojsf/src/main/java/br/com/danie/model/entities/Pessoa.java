
package br.com.danie.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idPessoa", nullable = false)
    private Integer ID;
    @Column(name="nome", nullable = false, length = 80)
    private String nome;
    @Column(name="email", nullable = false, length = 150)
    private String email;
    @Column(name="telefone", nullable = false, length = 40)
    private String telefone;
    @Column(name="cpf", nullable = false, length = 25)
    private String cpf;
    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento", nullable = false, length = 150)
    private Date dataNascimento;
    @Temporal(TemporalType.DATE)
    @Column(name="dataCadastro", nullable = false, length = 150)
    private Date dataCadastro;

    public Pessoa() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.ID != null ? this.ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.ID != other.ID && (this.ID == null || !this.ID.equals(other.ID))) {
            return false;
        }
        return true;
    }
    
    
}
