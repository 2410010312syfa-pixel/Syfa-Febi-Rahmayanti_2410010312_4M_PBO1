package penyewaanalatpancing;
public class Joran extends AlatPancing {
    public Joran(String nama, int harga, int stok) {
        super(nama, harga, stok);
    }
    @Override
    public void tampilkanInfo() {
        System.out.print("[JORAN] ");
        super.tampilkanInfo();
    }
}