package SwitchSentence;

public class SwitchS {
    int dia = 5;
    String day;
    {
        switch (dia) {
            case 1 :
                day = ("Lunes");
                System.out.println(day);
                break;
            case 2:
                day = ("Martes");
                System.out.println(day);
                break;
            case 3:
                day = ("Miercoles");
                System.out.println(day);
                break;
            case 4:
                day = ("Jueves");
                System.out.println(day);
                break;
            case 5:
                day = ("Viernes");
                System.out.println(day);
                break;
            default:
                System.out.println("Día incorrecto");

        }
    }
}


