package YoutuberTiago.classes;

public class App {
    public static void main(String[] args) {
      User[] users= new User[]{
              new User("Ricardo", "Pouza"),
              new User("Enzo", "Pouza")
      };
        System.out.println(users[1].getFirstName());
    }
}
