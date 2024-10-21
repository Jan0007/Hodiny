package Ukoly;

import java.util.Iterator;

public class MujIterator implements Iterator<Character> {
    MujRetezec rtz;
    int pozice = 0;

    public MujIterator(MujRetezec r) {
        this.rtz = r;
    }


    @Override
    public boolean hasNext() {
        if (rtz.str.length() > pozice) {
            return true;
        }
        return false;
    }

    @Override
    public Character next() {
        return rtz.str.charAt(pozice++);
    }
}
