package Hodina9;

import java.util.ArrayList;

public class Vrchol {
    public String jmeno;
    ArrayList<Vrchol> arr = new ArrayList<>();

    Vrchol(String jmeno) {
        this.jmeno = jmeno;
    }

    public void pridejSouseda(Vrchol v) {
        this.arr.add(v);
    }


    public boolean jeSousedem(Vrchol v) {
        return arr.contains(v);
    }

    public boolean existujeCestaDo(Vrchol v) {
        return arr.contains(v);
    }
}
