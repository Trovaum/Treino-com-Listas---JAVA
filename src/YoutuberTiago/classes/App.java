package YoutuberTiago.classes;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //cria uma lista
        List<User> users = new ArrayList<>();

        // cria a se 10 registros
        int i = 0;
        while (i < 10) {
            User actual = new User("Nome" + i, "Sobrenome" + i);
            users.add(actual);
            i++;
        }
        System.out.println(users.get(8).getFirstName());
        System.out.println(users.get(8).getLastName());

        // adiciona mais um registro
        User users11 = new User("Nome 11", "sobrenome 11");
        users.add(users11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());

        // ------------------------Method toString------------------------
        System.out.println("------------------------toString method----------------------");
        User userA = new User("Ricardo", "Pouza");

        System.out.println(userA.toString());

        //-------------------------Hashcode and Equals--------------------------------------------
        System.out.println("-------------------hashCode and Equals-------------------------");
        User userC = new User("Enzo", "Pouza");
        User userD = new User("Enzo", "Pouza");

        System.out.println(userC.equals(userD));
        System.out.println(userC.hashCode());
        System.out.println(userD.hashCode());


    }
}
