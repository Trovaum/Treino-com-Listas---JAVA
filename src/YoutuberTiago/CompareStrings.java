package YoutuberTiago;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String senha = "123456";
        System.out.println("Digite a senha: ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        compare(senha, pass);
    }
    static void compare(String teste1, String teste2){
        if(teste1.equals(teste2)){
            System.out.println("A senha confere!\n Bem vindo!!!");
        }else {
            System.out.println("A senha não confere!\n Tente novamente");
        }
    }
}
