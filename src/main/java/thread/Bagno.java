package thread;

public class Bagno {
    private boolean disponibile = true;
    
    public synchronized void entra() {
        String name = Thread.currentThread().getName();
        try {
            while ( ! disponibile ) {
                System.out.println(name + " in attesa di entrare...");
                wait();
            }
            disponibile = false;
            System.out.println(name + " entra in bagno");
        } catch ( InterruptedException e) { }
    }

    public synchronized void esci() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " esce dal bagno");
        disponibile = true;
        notifyAll();
    }

}
