package Hodina1;

import java.io.IOException;

public class Hodina1{
    public static void main(String[] args) throws InterruptedException, IOException {
        jedinacek_hodina jedin = jedinacek_hodina.getInstance();
        JedinacekVlakno thread = new JedinacekVlakno();

        thread.start();

        thread.sleep(1000);
        jedin.setState("jj");
        thread.sleep(1000);
        jedin.setState("gg");
        thread.sleep(1000);
    }
}
