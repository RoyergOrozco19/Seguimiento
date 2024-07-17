package ForeachSentence;

public class ForeachMain {
    public static void main(String[] args) {
        ForeachS lista = new ForeachS();

        for (String mensaje : lista.saludo)
            System.out.println(mensaje);
    }

}

