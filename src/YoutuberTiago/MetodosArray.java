package YoutuberTiago;

import java.util.ArrayList;
import java.util.List;

public class MetodosArray {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(){{
            add("Ricardo 1");
            add("Ricardo 2");
            add("Ricardo 3");
            add("Ricardo 4");
        }};
        System.out.println("Retorno da lista " + names.get(2));
        System.out.println("Tamanho da lista " + names.size());
        System.out.println("Se contem na lista " + names.contains("Ricardo 1"));
    }
}
