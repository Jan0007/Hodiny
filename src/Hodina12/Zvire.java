package Hodina12;

public class Zvire {
    int vaha;
    CastTela[] casti;

    public Zvire(CastTela[] casti, int vaha) {
        this.casti = casti;
        this.vaha = vaha;
    }

    public int VahaVsechOrganu() {
        int vaha = 0;
        for (int i = 0; i < casti.length; i++) {
            vaha += casti[i].vaha;
        }
        return vaha;
    }
}
