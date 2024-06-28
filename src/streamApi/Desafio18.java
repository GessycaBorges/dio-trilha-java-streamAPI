package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer primeiro = numeros.get(0);

        boolean saoIguais = numeros.stream()
                .allMatch(num -> num.equals(primeiro));

        if (saoIguais) {
            System.out.println("Os números são todos iguais a " + primeiro);
        } else {
            System.out.println("A lista é formada por números diferentes.");
        }
    }
}
