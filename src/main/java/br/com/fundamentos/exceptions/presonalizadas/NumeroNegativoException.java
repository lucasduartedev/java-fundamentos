package br.com.fundamentos.exceptions.presonalizadas;

public class NumeroNegativoException extends RuntimeException {

    private int n1;

    public NumeroNegativoException(int n1) {
        this.n1 = n1;
    }

    public String getMessage() {
        return String.format("O atributo %s está negativo :(", n1);
    }

}
