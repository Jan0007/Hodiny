package Hodina5;

public class HamNamTovarna implements Tovarna {
    @Override
    public Jidlo vyrobJidlo(String jmenoJidla) {
        if (jmenoJidla == null) {
            return null;
        } else if (jmenoJidla.equals("spekacek")) {
            return new HamNamSpekacek();
        } else if (jmenoJidla.equals("jogurt")) {
            return new HamNamJogurt();
        } else {
            throw new IllegalArgumentException("Nezname jidlo.");
        }
    }
}
