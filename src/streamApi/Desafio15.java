package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean temNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        if (temNegativo) {
            System.out.println("Contém pelo menos um número negatino na lista.");
        } else {
            System.out.println("Contém apenas números positivos.");
        }
    }
}
