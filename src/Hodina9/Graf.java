package Hodina9;

import java.util.ArrayList;

public class Graf {
    ArrayList<Vrchol> arr = null;

    public Graf() {
        arr = new ArrayList<>();
    }

    public Vrchol dejVrchol(String jmeno) {
        for (int i = 0; i < this.arr.size(); i++) {
            if (this.arr.get(i).jmeno == jmeno) {
                return this.arr.get(i);
            }
        }
        return null;
    }
}