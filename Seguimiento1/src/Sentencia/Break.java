package Sentencia;

public class Break {
    public int x;

    public void break1(){
        for(int i=1;i<=x;i++){
           if (i >= 10){
               break;
           }
           System.out.println(i);
        }
    }
}
