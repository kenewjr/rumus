package volume;

import java.util.Scanner;
import java.text.DecimalFormat;

public class bola extends BangunRuang {

    private double jari2, jari, ttl;
    DecimalFormat koma = new DecimalFormat();
    Scanner input = new Scanner(System.in);
    String pimpong;

    public void rumusbola(double jari) {
        do {
            System.out.println("Anda Memasuki Rumus bola ");
            System.out.println("rumus : 4/3 X phi X r3");
            System.out.print("masukan bilangan jari-jari : ");
            jari = input.nextInt();
            jari2 = Math.pow(jari, 3);
            ttl = 4 / 3 * Math.PI * jari2;
            System.out.println("Hasil Bola = " + koma.format(ttl) + " cm3");
            System.out.print("coba rumus bola lagi? ");
            pimpong = input.next();
        } while (pimpong.equals("yes") || pimpong.equals("y") || pimpong.equals("YES") || pimpong.equals("y"));
    }

}
