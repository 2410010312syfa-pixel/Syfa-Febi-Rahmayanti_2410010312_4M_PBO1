package penyewaanalatpancing;
public class Reel extends AlatPancing {
    public Reel(String nama, int harga, int stok) {
        super(nama, harga, stok);
    }
    @Override
    public void tampilkanInfo() {
        System.out.print("[REEL ] ");
        super.tampilkanInfo();
    }
}