package com.fundamentos.java.colletions;

import java.util.Scanner;

public class InformeNome {

	public static void main(String[] args) {
		
//		Abrir scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas vocês quer digitar? ");
		int qtdNotas = entrada.nextInt();

//		criar lista com a quantidade de notas informada
		double[] notas = new double[qtdNotas];
		
//		Coletar notas
		for(int i = 0; i < qtdNotas; i++) {
			System.out.printf("Informe a nota nº %d: ", i+1);
//			Recebendo dados de STRING para DOUBLE
			notas[i] = Double.parseDouble(entrada.next());
		}
		
//		Somar total
		double total = 0;
		for (double d : notas) {
			total += d;
		}
		
		if(qtdNotas > 0) {
//			Exibir resultado
			System.out.printf("Total: %.1f \n", total);
			
//			Exibir média
			System.out.printf("Média: %.1f \n", total/qtdNotas);
			
		} else {
			System.out.println("Nada informado!");
		}

//		Fechar scanner
		entrada.close();
		
//		Informar encerramento
		System.out.println("=== FIM ===");

	}

}
