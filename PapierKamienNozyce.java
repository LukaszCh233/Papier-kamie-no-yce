package Aplikacja;

import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("WITAJ W GRZE PAPIER KAMIEN NOZYCE :)");

        int odp;
        int przec;
        int lwygr = 0;
        int lprzeg = 0;
        String r = "REMIS";
        String w = "WIN";
        String l = "LOSE";

        for (int i = 1; i <= 3; i++) {
            System.out.println("podaj liczbe od 1 do 3");
            System.out.println("1 - paier 2 - kamien 3 - nozyce");

            odp = scanner.nextInt();
            if (odp == 1) {
                System.out.println("Wybrales papier");
            }
            if (odp == 2) {
                System.out.println("Wybrales kamien");
            }
            if (odp == 3) {

                System.out.println("Wybrales nozyce");
            }


            przec = rnd.nextInt(3) + 1;
            if (przec == 1) {
                System.out.println("Wybral papier");
            }
            if (przec == 2) {
                System.out.println("Wybral kamien");
            }
            if (przec == 3) {
                System.out.println("Wybral nozyce");
            }

            System.out.println();
            if (odp == przec) {
                lprzeg++;
                lwygr++;
                System.out.println(r);
            } else if (odp == 1 && przec == 2 || odp == 2 && przec == 3 || odp == 3 && przec == 1) {
                lwygr++;
                System.out.println(w);
            } else {
                lprzeg++;
                System.out.println(l);
            }
        }
        System.out.println();
        System.out.println("WYNIK TO: ");
        System.out.println(lwygr);
        System.out.println(lprzeg);
        if (lwygr > lprzeg) {
            System.out.println("GRATULACJE WYGRALES");
        }
        else if (lwygr < lprzeg) {
            System.out.println("NIESTETY PRZEGRALES");
        }
        else System.out.println("JEST REMIS");
    }

}

