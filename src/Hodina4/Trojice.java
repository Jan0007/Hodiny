package Hodina4;

public class Trojice {
    int a, b, c;
    int index = 0;

    public Trojice(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public MujIterator dejMyIterator() {
        return new MujIterator(this);
    }

    public static void main(String[] args) {
        Trojice i = new Trojice(1, 2, 3);

        MujIterator it1 = i.dejMyIterator();
        while(it1.hasNext()){
            int h = it1.next();
            MujIterator it2 = i.dejMyIterator();
            while (it2.hasNext()) {
                System.out.println(h + " " + it2.next());
            }
        }
    }
}
