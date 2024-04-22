package EjemploThreadPorInterfazRunnable;

public class PingPong2 implements Runnable {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras

    public PingPong2(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    ;

    public void run() {
        while (true) {
            System.out.print(word + " ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
