package Ukoly;

public class MujRetezec {
    String str;

    public MujRetezec(String str) {
        this.str = str;
    }

    public MujIterator getIterator() {
        return new MujIterator(this);
    }
}
