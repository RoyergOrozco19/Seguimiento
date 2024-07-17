package Comparacion;

import AritmeticosyLogicos.CondicionNot;

public class MainComparacionDiferente {
    public static void main(String[] args) {
        ComparacionDiferete comparacion = new ComparacionDiferete();
        comparacion.x = (1 != 3);
        comparacion.y = (3 != 3);

        System.out.println(""+comparacion.x);
        System.out.println(""+comparacion.y);

    }
}
