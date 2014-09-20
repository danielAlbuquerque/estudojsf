
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
@Table(name="tipoendereco")
public class TipoEndereco implements Serializable{
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdTipoEndereco", nullable = false)
    private Integer idTipoEndereco;
    
    @Column(name="nome", nullable = false, length = 30)
    private String nome;
    
    @OneToMany(mappedBy = "tipoendereco", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_TipoEndereco")
    private List<Endereco> endereco;

    public TipoEndereco() {
    }

    public Integer getIdTipoLogradouro() {
        return idTipoEndereco;
    }

    public void setIdTipoLogradouro(Integer idTipoLogradouro) {
        this.idTipoEndereco = idTipoLogradouro;
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
        int hash = 7;
        hash = 89 * hash + (this.idTipoEndereco != null ? this.idTipoEndereco.hashCode() : 0);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (this.idTipoEndereco != other.idTipoEndereco && (this.idTipoEndereco == null || !this.idTipoEndereco.equals(other.idTipoEndereco))) {
            return false;
        }
        return true;
    }
    
    

    
}
