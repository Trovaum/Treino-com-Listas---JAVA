package set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>(){{
            add("Sao Paulo");
            add("Brasilia");
            add("Rio de Janeiro");
            add("Belo Horizonte");
            add("Maceio");
            add("Amazonas");
        }};

        System.out.println("Inicio -> " + treeCapitais);
        System.out.println("retorno do topo da arvore -> "+ treeCapitais.first());
        System.out.println("retorno do ultimo elemento da arvore -> "+ treeCapitais.last());
        System.out.println(treeCapitais.lower("Maceio"));
        System.out.println(treeCapitais.higher("Maceio"));
        System.out.println("Verifica e remove a primeira da arvore -> "+ treeCapitais.pollFirst());
        System.out.println("Verifica e remove o ultimo da arvore -> "+ treeCapitais.pollLast());

        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println("==> " + iterator.next());
        }

        for (String capital : treeCapitais) {
            System.out.println("--> "+ capital);
        }
        System.out.println(" modificação final " + treeCapitais);
    }
}
