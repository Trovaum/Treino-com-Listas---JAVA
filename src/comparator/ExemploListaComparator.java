package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploListaComparator {
    public static void main(String[] args) {
        List<CarroEValor> modelList = new ArrayList<>(){{
            add(new CarroEValor("Corolla", 29000));
            add(new CarroEValor("Ford Ka", 36000));
            add(new CarroEValor("Civic", 86000));
            add(new CarroEValor("HR-V", 105000));
            add(new CarroEValor("Astra", 19000));
            add(new CarroEValor("Fusca", 24000));
        }};
        System.out.println("Ordem de inserção");
        System.out.println(modelList);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ordenação pela expressao Lambda (crescente)");
        modelList.sort((first, second) -> first.getValor() - second.getValor());
        System.out.println(modelList);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Ordenação usando java.util.Comparator");
        Collections.sort(modelList, new OrdemReversaValores());
        System.out.println(modelList);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Usando a interface Collections");
        Collections.sort(modelList);
        System.out.println(modelList);

    }
}
