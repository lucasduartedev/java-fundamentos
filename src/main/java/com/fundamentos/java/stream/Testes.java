package com.fundamentos.java.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Testes {
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes.add(new Cliente(1L, "Gustavo Vieira", "1231-3211", 59));
		clientes.add(new Cliente(2L, "Luana Silva", null, 24));
		clientes.add(new Cliente(3L, "Amanda Gomes", "5454-6565", 19));
		clientes.add(new Cliente(4L, "Luciano Queiroz", null, 15));
		clientes.add(new Cliente(5L, "J�lia Mendes", "9879-6546", 46));
		clientes.add(new Cliente(6L, "Helena Ribeiro", "1918-8284", 31));
		
		clientes.stream()
			.sorted(Comparator.comparing(Cliente::getNome))
			.distinct()
			.limit(2)
			.forEach(System.out::println);
		
		var mediaIdade = clientes.stream().mapToInt(Cliente::getIdade).average();
		
		System.out.println(mediaIdade.getAsDouble());
		
	}

}
