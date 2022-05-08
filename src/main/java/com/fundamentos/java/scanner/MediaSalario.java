package com.fundamentos.java.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MediaSalario {
	
	public static void main(String[] args) {
//		evitar exception -> InputMismatchException
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);

		List<Double> salarios = new ArrayList<Double>();
		
		// Usuário informa os salários
		for(int i = 1; i <= 3; i++) {
			
			System.out.printf("Informe o salario [%d]: %n", i);
			salarios.add(entrada.nextDouble());
			
		}
		
		Double media = 0.0;
		
		// Somar salarios informados
		for (Double x : salarios) {
			media += x;
		}
		
		// Exibir média salarial
		System.out.printf("Média dos salários: %f", media / salarios.size());
		
		entrada.close();
		
	}

}
