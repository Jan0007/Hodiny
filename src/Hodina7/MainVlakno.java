package Hodina7;

public class MainVlakno {
    public static void main(String[] args) {
        MojeVlakno t2 = new MojeVlakno();
        Thread tr2 = new Thread(t2);

        Runnable v1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 'a'; i <= 'l'; i++) {
                    System.out.println(i);
                }
            }
        };
        Runnable v2 = new Runnable() {
            @Override
            public void run() {
                for (int i = -1; i > -100; i--) {
                    System.out.println(i);
                }
            }
        };
        Thread u = new Thread( () -> {
                    for (int x = 0; x < 100; x++){
                        System.out.println(x + "gg");
                    }
                }
        );
        u.start();
        tr2.start();
        new Thread(v1).start();
        new Thread(v2).start();
    }
}
