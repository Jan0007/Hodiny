package Hodina1;

public class JedinacekVlakno extends Thread{

    @Override
    public void run() {
        jedinacek_hodina j = jedinacek_hodina.getInstance();
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
