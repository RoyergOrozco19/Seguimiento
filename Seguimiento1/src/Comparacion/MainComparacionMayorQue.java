package Comparacion;

public class MainComparacionMayorQue {
    public static void main(String[] args) {
        ComparacionIgual comparacion = new ComparacionIgual ();
        comparacion.x = (2>2);
        comparacion.y =(3>1);

        System.out.println(""+comparacion.x);
        System.out.println(""+comparacion.y);
    }
}