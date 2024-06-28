package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean positivos = numeros.stream()
                .allMatch(numero -> numero > 0);

        if (positivos) {
            System.out.println("Todos os números são positivos.");
        } else {
            System.out.println("Contém números negativos.");
        }
    }
}
