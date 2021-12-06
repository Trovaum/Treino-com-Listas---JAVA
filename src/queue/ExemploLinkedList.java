package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>() {{
            add("Renan");
            add("Ricardo");
            add("Enzo");
            add("Maria");
            add("Ana");
        }};

        //System.out.println(filaBanco);
        //String primeiroFila = filaBanco.poll();
        //System.out.println(primeiroFila);
        System.out.println(filaBanco);
        //String primeirodaFila = filaBanco.peek(); //se nã tiver elemento na lista retorna null
        //System.out.println(primeirodaFila);
        //filaBanco.clear();
        //String retornaErro = filaBanco.element();//se nã tive elemento na lista retorna Erro
        //System.out.println(retornaErro);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }
        Iterator<String> iterator = filaBanco.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        System.out.println(filaBanco.contains("Ricardo"));
        filaBanco.add("Jose");
        System.out.println(filaBanco);
    }
}
