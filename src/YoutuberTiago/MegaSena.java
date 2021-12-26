package YoutuberTiago;

import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random();
        int i = 0;
        while (i < 6){
            int next = generate.nextInt(1,60);
            System.out.println("Número: " + next);
            i++;
        }

    }
}
