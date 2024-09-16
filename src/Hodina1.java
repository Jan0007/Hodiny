public class Hodina1{
    public static void main(String[] args) {
        Jedinacek jedin = Jedinacek.getInstance();
        JedinacekVlakno thread = new JedinacekVlakno(jedin);
        thread.start();
    }
}
