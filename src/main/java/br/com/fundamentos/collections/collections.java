package br.com.fundamentos.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class collections {

    public static void msg(String mensagem) {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        // Listas
        List<Integer> numerosDaMegaSenha = Arrays.asList(32, 11, 50, 12, 44, 23);
        List<Integer> numerosRepetidos = Arrays.asList(32, 11, 50, 12, 44, 23, 32, 44, 11, 23, 50);

        // Stream Max
        msg("Exemplo de Stream com Max:");
        Optional<Integer> maximo = numerosDaMegaSenha.stream().max(Comparator.naturalOrder());
        
        System.out.println("Máximo: " + maximo.get());
        
        // Map
        msg("Exemplo de Stream com Map dobrando valor:");
        List<Integer> numerosDaMegaSenhaDobrado = numerosDaMegaSenha.stream().map(n -> n * 2).toList();
        System.out.println("Dobro: " + numerosDaMegaSenhaDobrado);
        
        // ForEach
        msg("Exemplo de Stream com forEach:");
        numerosDaMegaSenha.stream().forEach(e -> System.out.println(e));
        // ForEach com Limit
        msg("Exemplo de Stream com forEach e Limit:");
        numerosDaMegaSenha.stream().limit(3).forEach(e -> System.out.println(e));
        // ForEach com Skip
        msg("Exemplo de Stream com forEach e Skip:");
        numerosDaMegaSenha.stream().skip(2).forEach(e -> System.out.println(e));
        
        // Reduce
        msg("Exemplo de Stream com Reduce:");
        Optional<Integer> somaDosNumeros = numerosDaMegaSenha.stream().reduce((a, b) -> a + b);
        System.out.println("Soma dos números da mega: " + somaDosNumeros.get());

        // Distinct
        msg("Exemplo de Stream com Distinct:");
        List<Integer> numerosDistintos = numerosRepetidos.stream().distinct().toList();
        System.out.println("Distintos: " + numerosDistintos);

        // Ordenar os números
        msg("Exemplo de Stream com Sorted:");
        List<Integer> numerosOrdenados = numerosDaMegaSenha.stream().sorted().toList();
        System.out.println("Ordenados: " + numerosOrdenados);

        // Filter
        msg("Exemplo de Stream com Filter:");
        List<Integer> numerosFiltrados = numerosDaMegaSenha.stream()
                                            .filter(n -> n > 20)
                                            .filter(n -> n < 40)
                                            .toList();
        System.out.println("Filtrados: " + numerosFiltrados);

    }
}
