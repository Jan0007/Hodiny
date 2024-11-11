package Hodina6;

public class MojeTrojice<T> implements Comparable {
    T p1;
    T p2;
    T p3;

    public MojeTrojice(T p1, T p2, T p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "MojeTrojice{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

    public static void main(String[] args) {
        MojeTrojice<String> t = new MojeTrojice<>("1", "dsaf", "3");
        System.out.println(t);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
