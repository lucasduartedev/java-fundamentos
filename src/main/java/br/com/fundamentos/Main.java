package br.com.fundamentos;

import br.com.fundamentos.models.Cliente;
import br.com.fundamentos.models.Conta;
import br.com.fundamentos.models.Contato;
import br.com.fundamentos.models.Endereco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Início do projeto");

        Contato contato = new Contato("123123123", "gustavo@gmail.com");
        Endereco endereco = new Endereco("123123123", "Rua 1", "123");
        Cliente clienteUm = new Cliente("Gustavo Gomes", "12312312345", contato, endereco);
        Conta conta = new Conta("123123123", clienteUm);
        Conta conta2 = new Conta("2121");

        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.depositar(-100);
        conta.depositar(100);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.sacar(50);
        System.out.println("Saldo atual: " + conta.getSaldo());
        conta.sacar(-80);
        conta.sacar(80);
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
        conta.transferir(25, conta2);
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
        System.out.println("Saldo conta: " + conta.getSaldo());

    }
}