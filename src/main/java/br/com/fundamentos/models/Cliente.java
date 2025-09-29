package br.com.fundamentos.models;

import java.util.UUID;

public class Cliente {

    private UUID id;
    private String nome;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Cliente() {}

    public Cliente(String nome, String cpf, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    // Getters & Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                '}';
    }
}
