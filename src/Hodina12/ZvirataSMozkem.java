package Hodina12;

import java.util.Arrays;

public class ZvirataSMozkem extends Zvire {
    Mozek mozek;

    public ZvirataSMozkem(CastTela[] casti, int vaha, Mozek mozek) {
        super(casti, vaha);
        this.mozek = mozek;
    }
}
