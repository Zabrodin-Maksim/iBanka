package iBanka;

import java.io.FileWriter;
import java.io.IOException;

public class SeznamTransakci {
    private Transakce[] transakce;
    private int actualni;
    private int max;


    public SeznamTransakci() {
        this.max = 50;
        this.transakce = new Transakce[max];
        this.actualni = 0;
    }

    public void pridejTransakci(Transakce transakce){
        if (actualni <= max) {
            this.transakce[actualni] = transakce;
            actualni++;
        } else {
            System.out.println("Nemate dost mista");
        }
    }

    public void vypisTransakce(){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null) {
                System.out.println(transakce[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }
    public void vypisTransakce(DruhTransakce druh){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null && transakce[i].getDruhTransakce().equals(druh)) {
                System.out.println(transakce[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }


    public void vypisTransakce(String cisloUctu, int kodBanky){
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null && transakce[i].getCisloUctu().equals(cisloUctu) && transakce[i].getKodBanky() == kodBanky) {
                System.out.println(transakce[i].toString());
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
    }

    public Transakce najdiNejvetsiTransakci(DruhTransakce druh){
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null && transakce[i].getDruhTransakce().equals(druh)) {
                if (transakce[i].getCastka() >= temp){
                    temp = transakce[i].getCastka();
                }
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
        System.out.println("Nejvetsi transakce je: " + temp);
        return null;
    }


    public int sumaTransakci(String cisloUctu, int kodBanky, DruhTransakce druh){
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null && transakce[i].getCisloUctu().equals(cisloUctu) && transakce[i].getKodBanky() == kodBanky && transakce[i].getDruhTransakce().equals(druh)) {
                temp += transakce[i].getCastka();
                flag = true;
            }
        }
        if (!flag) System.out.println("Pole je prazdne!");
        return temp;
    }

    public void ulozTransakceDoSouboru(String nazevSouboru, DruhTransakce druh) throws IOException {
        FileWriter writer = new FileWriter(nazevSouboru + ".txt");
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            if (transakce[i] != null && transakce[i].getDruhTransakce().equals(druh)) {
                writer.write(transakce[i].toString() + "\n");
                flag = true;
            }
        }
        writer.close();
        if (!flag) System.out.println("Pole je prazdne!");
    }
}
