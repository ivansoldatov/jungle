import model.Prey;
import model.Predator;

public class Events {

    static Prey antelope = new Prey("Антилопа");
    static  Prey zebra = new Prey("Зебра");
    static Predator tiger = new Predator("Тигр");
    static Predator leopard = new Predator("Леопард");

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tiger.hunt(zebra);
            }
        });
        thread1.start();
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                leopard.hunt(zebra);
            }
        });

    }

    private void bigHunt(Predator pr, Prey p1, Prey p2) {
        pr.hunt(p1);
        pr.hunt(p2);
    }
}
