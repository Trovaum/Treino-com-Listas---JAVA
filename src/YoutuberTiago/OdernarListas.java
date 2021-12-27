package YoutuberTiago;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OdernarListas {
    public static void main(String[] args) {
        List<Integer> index = new ArrayList<>(){{
            add(1);
            add(8);
            add(7);
            add(9);
            add(3);
            add(2);
            add(11);
        }};
        Collections.sort(index);

        for ( int name : index) {
            System.out.println("Lista ordenada: " + name);
        }
    }

}
