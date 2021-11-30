import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gato> meuGato = new ArrayList<>(){{
            add(new Gato("Bigol", 12, "Amarelo"));
            add(new Gato("loko", 04, "azul"));
            add(new Gato("Ary", 18, "Preto"));
            add(new Gato("lemão", 51, "Verde"));
        }};

        System.out.println("Imprima na ordem de inserção!");
        System.out.println(meuGato);

        System.out.println("Imprima na ordem aleatória!");
        Collections.shuffle(meuGato);
        System.out.println(meuGato);

        System.out.println("Imprima na ordem natural dos gatos: ");
        Collections.sort(meuGato);
        System.out.println(meuGato);

        System.out.println("Imprima pela ordem de idade: ");
        Collections.sort(meuGato, new ComparadorIdade());
        System.out.println(meuGato);

        System.out.println("Imprima pela ordem da cor: ");
        meuGato.sort(new ComparadorDeCor());
        System.out.println(meuGato);

        System.out.println("Imprima pela Nome, idade e cor: ");
        meuGato.sort(new ComparadorNomeCorIdade());
        System.out.println(meuGato);
    }
}
