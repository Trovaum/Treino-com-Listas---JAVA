package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>(){{
            add(5.8);
            add(7.5);
            add(8.9);
            add(6.3);
            add(4.8);
            add(9.4);
            add(2.2);
        }};

        System.out.println(notasAlunos);
        notasAlunos.remove(2.2);
        System.out.println("REmovido 2.2" + notasAlunos);
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("com iterator/while " + iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("com for " + nota);
        }
        System.out.println("tamanho  da lista " + notasAlunos.size());
        System.out.println("verifica se a lista esta vazia: " + notasAlunos.isEmpty());
    }
}
