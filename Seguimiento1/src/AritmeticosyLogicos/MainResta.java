package AritmeticosyLogicos;

public class MainResta {
    public static void main(String[] args) {
        Resta resta = new Resta();
        resta.x = 10;
        resta.y = 20;

        System.out.println(resta.restar());
    }
}
