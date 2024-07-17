package AritmeticosyLogicos;

public class MainMultiplicacion {
    public static void main(String[] args) {
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.x = 4;
        multiplicacion.y = 20;

        System.out.println(multiplicacion.multiplicar());
    }

}
