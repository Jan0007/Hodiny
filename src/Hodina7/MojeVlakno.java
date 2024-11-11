package Hodina7;

public class MojeVlakno implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i<100; i++) {
            System.out.println(i);
        }
    }
}
