package com.fundamentos.java.scanner;

import java.util.Scanner;

public class TecladoScanner {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		if(false) {
			System.out.printf("Informe seu nome: ");
			String nome = entrada.nextLine();
			System.out.printf("Nome: %s", nome);
		}
		
		System.out.print("Digite um n?mero: ");
		int n1 = entrada.nextInt();
		System.out.printf("N?mero: %d", n1);
		
	}

}
