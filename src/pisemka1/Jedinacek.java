package pisemka1;

public class Jedinacek {

    private static Jedinacek singletonInstance;
    int counter = -1;
    private Jedinacek() {
        this.counter = 0;
    }

    public synchronized static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }
}
