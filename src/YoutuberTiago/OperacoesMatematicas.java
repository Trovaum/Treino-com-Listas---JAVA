package YoutuberTiago;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        sum(2, 1);
        subtrair(2, 1);
        multiplicar(2,1);
        dividir(2,1);
    }

    static void sum(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    static void subtrair(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
    static void multiplicar(int x, int y){
        System.out.println(x + " x " + y + " = " + (x * y));
    }
    static void dividir(int x, int y){
        System.out.println(x + " / " + y + " = " + (x / y));
    }
}
