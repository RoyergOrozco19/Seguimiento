package ElseIF;

public class ElseIf1 {
    public int x;

    public void numeroes(){
        if (x>0){
            System.out.println("El numero " +x+ " es positivo");
        } else if (x<0) {
            System.out.println("El numero " +x+ " es negativo");
        }else {
            System.out.println("El numero " +x+ " es cero");
        }
    }
}
