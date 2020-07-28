package volume;

import java.util.Scanner;

public class BangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tabung Tabung = new tabung();
        bola Bola = new bola();
        kerucut v = new kerucut();
        double jari = 0,
               tinggi = 0;
        int b;
        String answer;
        do {
            System.out.println("LIST Rumus ");
            System.out.println("1.Bola");
            System.out.println("2.Tabung");
            System.out.println("3.Kerucut");
            System.out.print("Pilih Rumus : ");
            do {
                b = input.nextInt();
                if (b > 3 || b < 1) {
                    System.out.println("mohon masukan nomor 1,2,3");
                }
            } while (b > 3 || b < 1);
            switch (b) {
                case 1:
                    Bola.rumusbola(jari);
                    break;
                case 2:
                    Tabung.rumustabung(jari, tinggi);
                    break;
                case 3:
                    v.rumuskerucut(jari, tinggi);
                    break;
            }
            System.out.println("coba lagi? ");
            answer = input.next();
        } while (answer.equals("yes") || answer.equals("y") || answer.equals("YES") || answer.equals("y"));
    }
}
