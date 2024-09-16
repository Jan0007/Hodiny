public class Jedinacek {
    private static Jedinacek singletonInstance;
    String state = null;
    private Jedinacek() { }

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
            singletonInstance.state = "startuju";
        }
        return singletonInstance;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String s) {
        this.state = s;
    }
}
