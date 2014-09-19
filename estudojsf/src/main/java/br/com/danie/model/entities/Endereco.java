
package br.com.danie.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    
}
