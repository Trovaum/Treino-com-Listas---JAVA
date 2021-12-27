package YoutuberTiago;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // pega entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // variaveis iniciais da sequencia
        int f1 = 0;
        int f2 = 1;

        // entrada do limite da sequencia
        System.out.println("Digite um número para iniciar: ");
        int limit = scanner.nextInt();

        // faz a soma e as atribuiçoes.
        while (f2 < limit){
            int fn = f1 + f2;
            if (fn > limit)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
