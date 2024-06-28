package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int minimo = 5;
        int maximo = 10;

        numeros.stream()
                .filter(n -> n > minimo && n < maximo)
                .forEach(System.out::println);
    }
}
