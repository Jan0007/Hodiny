package Hodina7;

import java.util.Iterator;

public class Trojice {
    int a, b, c;
    int index = 0;

    public Trojice(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    class InternIterator implements Iterator<Integer> {
        int pozice = 0;

        @Override
        public boolean hasNext() {
            return this.pozice < 3;
        }

        @Override
        public Integer next() {
            switch(pozice++) {
                case 0: return a;
                case 1: return b;
                case 2: return c;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Trojice i = new Trojice(1, 2, 3);

        /*InternIterator it1 = new i.InternIterator();
        while(it1.hasNext()){
            int h = it1.next();
            while (it2.hasNext()) {
                System.out.println(h + " " + it2.next());
            }
        }*/
    }
}
