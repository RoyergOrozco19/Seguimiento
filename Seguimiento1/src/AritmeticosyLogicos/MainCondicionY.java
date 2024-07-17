package AritmeticosyLogicos;

public class MainCondicionY {
    public static void main(String[] args) {

            CondicionY condicion = new CondicionY();
            condicion.x = true;
            condicion.y = false;

            System.out.println("¿Ambas condiciones son verdaderas? " + condicion.Sonverdaderas());
        }
    }

