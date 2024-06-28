package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long numerosDistintos = numeros.stream()
                .distinct()
                .count();

        if (numerosDistintos == numeros.size()) {
            System.out.println("Os números da lista são distintos (não se repetem).");
        } else {
            System.out.println("Há números repetidos na lista.");
        }
    }
}
