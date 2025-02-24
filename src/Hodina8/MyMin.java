package Hodina8;

import java.util.Scanner;

public class MyMin {
    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Nejmensi cislo ze vsech je: " + min(x,y));
    }
}
