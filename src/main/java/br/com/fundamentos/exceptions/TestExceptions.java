package br.com.fundamentos.exceptions;

public class TestExceptions {

    static void gerarErro1() throws Exception {
        throw new RuntimeException("Ocorreu um erro! Erro 01!");
    }

    static void gerarErro2() throws Exception{
        throw new Exception("Exceção lançada!");
    }

    public static void main(String[] args) {

        try {
            // System.out.println(5/0);
            // gerarErro1();
            // gerarErro2();
        } catch (Exception e) {
            // System.out.println("Exceção capturada");
            System.out.println(e.getMessage());
        }

    }

}
