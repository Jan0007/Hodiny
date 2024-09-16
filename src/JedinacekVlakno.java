public class JedinacekVlakno extends Thread{
    Jedinacek jedin;

    public JedinacekVlakno(Jedinacek jedin) {
        this.jedin = jedin;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(jedin.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
