
package br.com.danie.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="estado")
public class Estado implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "idEstado", nullable = false)
    private Integer idEstado;
    
    @Column(name="nome", length = 40, nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
    @ForeignKey(name="EstadoEndereco")
    private List<Endereco> endereco;

    public Estado() {
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.idEstado != null ? this.idEstado.hashCode() : 0);
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
        final Estado other = (Estado) obj;
        if (this.idEstado != other.idEstado && (this.idEstado == null || !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
