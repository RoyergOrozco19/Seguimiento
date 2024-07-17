package Sentencia;

public class Continue {
    public int x;

    public void continue1(){
        for(int i=1;i<=x;i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
