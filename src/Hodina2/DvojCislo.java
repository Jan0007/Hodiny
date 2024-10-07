package Hodina2;

public class DvojCislo {
    private int prvni;
    private int druhy;

    public DvojCislo(int p, int d) {
        this.prvni = p;
        this.druhy = d;
    }

    public int prictiPrvni(int u) {
        return this.prvni + u;
    }

    public int prictiDruhy(int u) {
        return this.druhy + u;
    }
}
