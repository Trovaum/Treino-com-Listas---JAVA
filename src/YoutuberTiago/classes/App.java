package YoutuberTiago.classes;

public class App {
    public static void main(String[] args) {
        User[] users = new User[10];

        for (int i = 0; i < users.length ; i++ ){
            User userActual = new User();
            userActual.setFirstName("Nome: " + i);
            userActual.setLastName("Sobrenome: " + i);
            users[i] = userActual;
        }

        System.out.println(users[1].getFirstName());
        System.out.println(users[1].getLastName());
    }
}
