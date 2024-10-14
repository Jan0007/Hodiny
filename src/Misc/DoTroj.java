package Misc;

import java.util.Scanner;

public class DoTroj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vstup = sc.nextInt();
        String out = "";

        while(vstup > 0){
            out = (vstup % 3) + out;
            vstup /= 3;
        }

        System.out.println(out);
    }
}
