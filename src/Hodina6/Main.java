package Hodina6;

public class Main {
    public static void main(String[] args) {
        UserProfile r1 = UserProfile.getInstance("1");
        UserProfile r2 = UserProfile.getInstance("1");
        System.out.println(r1.getJmeno());
        System.out.println(r2.getJmeno());
    }
}
