package com.fundamentos.java.colletions;

public class Primeiro {

	public static void main(String[] args) {

		double[] ns1 = new double[4];
		ns1[0] = 156;
		ns1[1] = 486.7;
		ns1[2] = 678.9;
		ns1[3] = 184;
		
		// Exibir número por número		
		for(double n : ns1) {
			System.out.println(n);
		}
		
		double total = 0;
		// Calular total
		for(double n : ns1) {
			total += n;
		}
		
		// Exibir resultado
		System.out.printf("Total: %.2f", total);
		
	}

}
