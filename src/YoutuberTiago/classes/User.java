package YoutuberTiago.classes;

public class User {
    private String firstName;
    private  String lastName;

    public  void setName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public String getName(){
        return firstName;
    }
}
