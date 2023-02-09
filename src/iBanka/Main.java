package iBanka;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        SeznamTransakci seznam = new SeznamTransakci();

        System.out.println("zadej cislo uctu");
        String cisloUctu = in.nextLine();

        System.out.println("zadej kod Banky");
        int kodBanky = in.nextInt();

        System.out.println("zadej castku");
        int castka = in.nextInt();


        Transakce transakce1 = new Transakce(cisloUctu,kodBanky,castka, DruhTransakce.PRICHOZI);


        seznam.pridejTransakci(transakce1);
        seznam.vypisTransakce();

        seznam.ulozTransakceDoSouboru("test", DruhTransakce.PRICHOZI);


       // SeznamTransakci seznam = new SeznamTransakci();
       // Transakce transakce1 = new Transakce("2345", 23, 30000, DruhTransakce.PRICHOZI);
       // seznam.pridejTransakci(transakce1);


    }
}