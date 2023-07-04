package br.com.bkmmtech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id // indica que o atributo id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica que o valor do id será gerado automaticamente pelo banco de dados ao inserir uma nova entidade
    private Long id;
    private String nomeCompleto;
    private String documento;
    private String endereco;
    private String formaDeContato;

    public Cliente() {}

    public Cliente(Long id, String nomeCompleto, String documento, String endereco, String formaDeContato) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
        this.endereco = endereco;
        this.formaDeContato = formaDeContato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFormaDeContato() {
        return formaDeContato;
    }

    public void setFormaDeContato(String formaDeContato) {
        this.formaDeContato = formaDeContato;
    }
}
