package AritmeticosyLogicos;

public class MainCondiconNot {
    public static void main(String[] args) {
        CondicionNot condicon = new CondicionNot();
        condicon.x = !(1 > 3);
        condicon.y = !(4 < 3);

        System.out.println("Ambas condiciones son iguales?"+condicon.Invierte());

    }
}
