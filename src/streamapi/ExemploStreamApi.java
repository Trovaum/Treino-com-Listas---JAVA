package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamApi {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>() {{
            add("Bruno");
            add("Renan");
            add("Cris");
            add("Enzo");
            add("Ricardo");
            add("Lourival");
        }};

        System.out.println(estudantes);
        System.out.println("Contagem " + estudantes.stream().count());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("Estudantes com letra r no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Retorna uma nova coleção com o número de letras. " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        System.out.println("Retorna os tres primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Retorna a mesma lista: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("-------------------------------------------------------");
        estudantes.stream().forEach(System.out::println);
        System.out.println("Algum elemento com W no nome?: "+ estudantes.stream().allMatch(elemento -> elemento.contains("W")));
        System.out.println("Tem algum elemento  com a minusculo? "+ estudantes.stream().anyMatch(elemento -> elemento.contains("a")));
        System.out.println("retorna o primeiro elemnto da coleção: ");
        estudantes.stream().findFirst().isPresent();
    }
}
