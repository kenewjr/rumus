package volume;

import java.util.Scanner;
import java.text.DecimalFormat;

public class tabung extends BangunRuang {

    private double jari, tinggi, jari2, rxt, ttl;

    DecimalFormat koma = new DecimalFormat();
    Scanner input = new Scanner(System.in);
    String pimpong;

    public void rumustabung(double jari, double tinggi) {
        do {
            System.out.println("Anda Memasuki Rumus Tabung");
            System.out.println("rumus : phi x r2 x t");
            System.out.print("masukan bilangan jari jari : ");
            jari = input.nextDouble();
            jari2 = Math.pow(jari, 2);
            System.out.print("masukan bilangan tinggi : ");
            tinggi = input.nextDouble();
            rxt = jari2 * tinggi;
            ttl = Math.PI * rxt;
            System.out.println("hasil Tabung = " + koma.format(ttl) + " cm3");
            System.out.print("coba rumus Tabung lagi? ");
            pimpong = input.next();
        } while (pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));
    }
}
