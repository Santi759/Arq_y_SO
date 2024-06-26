package EjemploThreadPorHerencia;

public class PingPong extends Thread {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    @Override
    public void run() { //Se sobrescribe run() de Thread
        while (true) {
            System.out.print(word + " ");
            try {
                PingPong.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }

    }
}
