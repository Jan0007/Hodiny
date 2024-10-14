package Hodina5;

public class Main {

    public static void main(String[] args) {
        Tovarna tovarna = new Tovarna();
        Jidlo j = tovarna.vyrobJidlo("spekacek");

        System.out.println(j.dejCenu());
    }
}

