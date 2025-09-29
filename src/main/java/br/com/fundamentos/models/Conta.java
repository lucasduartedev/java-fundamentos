package br.com.fundamentos.models;

import java.util.UUID;

public class Conta {

    private UUID id;
    private String numero;
    private double saldo;
    private Cliente cliente;

    // Métodos privados
    private void aumentarSaldo(double valor) {
        this.saldo += valor;
    }
    private void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }
    private void mensagem(Conta conta, double valor) {
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
        } else if (valor <= 0) {
            System.out.println("Valor deve ser maior do que 0 (zero)");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente");
        }
    }

    // Métodos públicos

    public void depositar(double valor) {
        if (valor <= 0) {
            mensagem(this, valor);
        } else {
            this.aumentarSaldo(valor);
            System.out.println("Depositado R$ " + valor);
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.diminuirSaldo(valor);
            System.out.println("Sacado R$ " + valor);
        } else {
            mensagem(this, valor);
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.diminuirSaldo(valor);
            contaDestino.aumentarSaldo(valor);
            System.out.println("Transferido R$ " + valor);
        } else {
            mensagem(this, valor);
        }
    }

    // Constructors
    public Conta() {}

    public Conta(String numero, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    // Apenas para testes
    public Conta(String numero) {
        this.id = UUID.randomUUID();
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Getters & Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
