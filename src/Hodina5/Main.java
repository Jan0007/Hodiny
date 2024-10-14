package Hodina5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DobraTovarna tovarna = new DobraTovarna();
        HamNamTovarna t = new HamNamTovarna();
        Jidlo u = t.vyrobJidlo("spekacek");

        System.out.println(u.dejCenu());

        ArrayList<Jidlo> arr = new ArrayList<>();

        while(true){
            String slovo = sc.nextLine();
            if (slovo.equals("done")) {
                break;
            }
            arr.add(tovarna.vyrobJidlo(slovo));
        }

        int cena = 0;
        for (Jidlo j : arr){
            cena += j.dejCenu();
            System.out.println(j.getClass().getSimpleName());
        }
        System.out.println("cena: " + cena);
    }
}

