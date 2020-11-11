import model.Prey;
import model.Predator;

public class Events {

    static Prey antelope = new Prey("Антилопа", 500);
    static Prey zebra = new Prey("Зебра", 1000);
    static Predator tiger = new Predator("Тигр");
    static Predator leopard = new Predator("Леопард");

    public static void main(String[] args) {

       /* Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tiger.hunt(zebra);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                leopard.hunt(zebra);
            }
        });
        thread2.start();*/

        new Thread(() -> bigHunt(tiger, antelope, zebra)).start();

        new Thread(() -> bigHunt(leopard, zebra, antelope)).start();
    }

    private static void bigHunt(Predator pr, Prey p1, Prey p2) {
        synchronized (p1) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (p2) {
                pr.hunt(p1);
                pr.hunt(p2);
            }
        }
    }
}
