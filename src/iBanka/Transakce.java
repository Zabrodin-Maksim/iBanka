package iBanka;

public class Transakce {
    private String cisloUctu;
    private int kodBanky;
    private int castka;
    private DruhTransakce druhTransakce;

    public Transakce(String cisloUctu, int kodBanky, int castka, DruhTransakce druhTransakce) {
        this.cisloUctu = cisloUctu;
        this.kodBanky = kodBanky;
        this.castka = castka;
        this.druhTransakce = druhTransakce;
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public int getKodBanky() {
        return kodBanky;
    }

    public int getCastka() {
        return castka;
    }

    public DruhTransakce getDruhTransakce() {
        return druhTransakce;
    }

    @Override
    public String toString() {
        return "Transakce{" +
                "cisloUctu='" + cisloUctu + '\'' +
                ", kodBanky=" + kodBanky +
                ", castka=" + castka +
                ", druhTransakce=" + druhTransakce +
                '}';
    }
}
