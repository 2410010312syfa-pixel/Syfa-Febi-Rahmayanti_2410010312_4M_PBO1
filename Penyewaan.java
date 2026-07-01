package penyewaanalatpancing;
public class Penyewaan {
    private String namaPenyewa;
    private AlatPancing alat;
    private int lamaSewa;
    private int totalBayar;
    public Penyewaan(String namaPenyewa, AlatPancing alat, int lamaSewa) {
        this.namaPenyewa = namaPenyewa;
        this.alat = alat;
        this.lamaSewa = lamaSewa;
        this.totalBayar = alat.getHarga() * lamaSewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public AlatPancing getAlat() {
        return alat;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public void setAlat(AlatPancing alat) {
        this.alat = alat;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
        this.totalBayar = alat.getHarga() * lamaSewa;
    }
    public void tampilkanPenyewaan() {
        System.out.println("--------------------------------------");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Nama Alat    : " + alat.getNama());
        System.out.println("Harga/Hari   : Rp" + alat.getHarga());
        System.out.println("Lama Sewa    : " + lamaSewa + " hari");
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("--------------------------------------");
    }
}