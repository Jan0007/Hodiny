package Ukoly;

import Hodina4.MyIterator;

public class Iterator {
    public static void main(String[] args) {
        MujRetezec r = new MujRetezec("ahoj");
        MujIterator i = r.getIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
