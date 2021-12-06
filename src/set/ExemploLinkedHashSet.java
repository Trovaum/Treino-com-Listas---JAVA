package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        System.out.println(sequenciaNumerica);
        System.out.println("tamanho da lista: " + sequenciaNumerica.size());
        System.out.println("remove item lista: " + sequenciaNumerica.remove(5) );
        System.out.println("Depois do remove: " + sequenciaNumerica);

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator ----> "+ iterator.next());
        }

        for (Integer numero : sequenciaNumerica) {
            System.out.println("for ----> " + numero);
        }
        System.out.println("Metodo contains: " +  sequenciaNumerica.contains(2));
        System.out.println("metodo se lista esta vazia: "+  sequenciaNumerica.isEmpty());

    }
}
