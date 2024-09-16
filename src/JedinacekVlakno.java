public class JedinacekVlakno extends Thread{

    @Override
    public void run() {
        Jedinacek j = Jedinacek.getInstance();
        while(true) {
            System.out.println(j.getState());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
