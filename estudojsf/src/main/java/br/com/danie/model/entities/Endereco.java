
package br.com.danie.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import org.hibernate.annotations.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idEndereco", nullable = false)
    private Integer idEndereco;
    
    @Column(name="bairro", length = 50, nullable = false)
    private String bairro;
    
    @Column(name="nomeLogradouro", length = 90, nullable = false)
    private String nomeLogradouro;
    
    @Column(name="cep", length = 20, nullable = false)
    private String cep;
    
    @Column(name="logradouro", length = 100, nullable = false)
    private String logradouro;
    
    @Column(name="numero", length = 100, nullable = false)
    private Integer numero;
    
    @Column(name="complemento", nullable = false)
    private String complemento;
    
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @ForeignKey(name = "EnderecoPessoa")
    @JoinColumn(name = "idpessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @ForeignKey(name = "EnderecoTipoLogradouro")
    @JoinColumn(name = "idTipoLogradouro", referencedColumnName = "idTipoLogradouro")
    private TipoLogradouro tipoLogradouro;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @ForeignKey(name = "EnderecoEstado")
    @JoinColumn(name = "idEstado")
    private Estado estado;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @ForeignKey(name = "EnderecoTipoEndereco")
    @JoinColumn(name = "idTipoEndereco", referencedColumnName = "idTipoEndereco")
    private TipoEndereco tipoEndereco;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @ForeignKey(name = "EnderecoCidade")
    @JoinColumn(name = "idCidade", referencedColumnName = "idCidade")
    private Cidade cidade;

    public Endereco() {
        this.cidade = new Cidade();
        this.estado = new Estado();
        this.tipoLogradouro = new TipoLogradouro();
        this.tipoEndereco = new TipoEndereco();
        this.pessoa = new Pessoa();
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.idEndereco != null ? this.idEndereco.hashCode() : 0);
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
        final Endereco other = (Endereco) obj;
        if (this.idEndereco != other.idEndereco && (this.idEndereco == null || !this.idEndereco.equals(other.idEndereco))) {
            return false;
        }
        return true;
    }
    
    
}
