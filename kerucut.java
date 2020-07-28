package volume;

import java.text.DecimalFormat;
import java.util.Scanner;

public class kerucut extends BangunRuang {

    private double jari, ttl, jari2, tinggi,ttlv;
    DecimalFormat koma = new DecimalFormat();
    Scanner input = new Scanner(System.in);
    String pimpong;

    public void rumuskerucut(double jari, double tinggi) {
        do {
            System.out.println("Anda Memasuki Rumus Kerucut");
            System.out.println("rumus : 1/3 X phi X r2 X t");
            System.out.print("masukan bilangan jari : ");
            jari = input.nextDouble();
            jari2 = Math.pow(jari,2);
            System.out.print("masukan bilangan tinggi : ");
            tinggi = input.nextDouble();
            ttl = 0.3*Math.PI*jari2*tinggi;
            System.out.println("Hasil Kerucut = " + koma.format(ttl) + " cm3");
            System.out.print("coba rumus Kerucut lagi? ");
            pimpong = input.next();
        } while (pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));
    }
}
