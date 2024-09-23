public class CCislo {
    private final double r;
    private final double i;

    private CCislo(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public CCislo add(CCislo c){
        double i = this.i;
        double r = this.r;

        i += c.getI();
        r += c.getR();

        return new CCislo(r, i);
    }

    public double getI() {
        return this.i;
    }

    public double getR() {
        return this.r;
    }

    @Override
    public String toString() {
        return "CCislo{" +
                "r=" + r +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {
        CCislo c1 = new CCislo(1, 1);
        CCislo c2 = new CCislo(1, 1);

        System.out.println(c1.add(c2));
    }
}
