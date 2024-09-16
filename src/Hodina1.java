public class Hodina1 implements Runnable {
    public static void main(String[] args) {
        Jedinacek jedin = Jedinacek.getInstance();
        Thread thread = new Thread();


        System.out.println(jedin.getState());
        thread.start();
        System.out.println(jedin.getState());
    }

    @Override
    public void run() {
        System.out.println("why are you runnin");
    }
}
