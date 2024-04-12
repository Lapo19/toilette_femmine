package thread;

public class Main {
    public static void main(String[] args) {
        Bagno b1 = new Bagno();
        String[] nomi = {"Marco", "Marta", "Francesco","Lorenzo"};

        for(String s: nomi) {
            Persona t = new Persona(b1, s);
            t.start();
        }
    }

}