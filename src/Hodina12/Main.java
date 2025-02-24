package Hodina12;

public class Main {
    public static void main(String[] args) {
        Mozek mozek = new Mozek("chytry");

        CastTela[] casti1 = new CastTela[6];
        CastTela[] casti2 = new CastTela[2];

        casti1[0] = new Noha(20, 20);
        casti1[1] = new Noha(20, 20);
        casti1[2] = new Noha(20, 20);
        casti1[3] = new Noha(20, 20);

        casti1[4] = new Oko("Zelena", 20);
        casti1[5] = new Oko("Modra", 20);

        casti2[0] = new Chapadla(20);
        casti2[1] = new Chapadla(20);

        Pes pes = new Pes(casti1, 180, mozek);

        System.out.println(pes);

        Nezmar nezmar = new Nezmar(casti2, 140);
    }
}
