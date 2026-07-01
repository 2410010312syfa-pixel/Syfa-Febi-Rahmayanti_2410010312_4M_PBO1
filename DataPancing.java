package penyewaanalatpancing;
import java.util.ArrayList;
public class DataPancing {
    ArrayList<AlatPancing> daftarAlat = new ArrayList<>();
    ArrayList<Penyewaan> daftarSewa = new ArrayList<>();
    public DataPancing() {
        daftarAlat.add(new Joran("Joran Shimano", 50000, 5));
        daftarAlat.add(new Reel("Reel Daiwa", 40000, 4));
        daftarAlat.add(new AlatPancing("Kotak Pancing", 20000, 6));
        daftarAlat.add(new AlatPancing("Jaring Ikan", 15000, 3));
        daftarAlat.add(new AlatPancing("Kursi Lipat", 10000, 8));
    }
    public void tampilkanAlat() {
        System.out.println("\n===== DAFTAR ALAT PANCING =====");
        for (AlatPancing alat : daftarAlat) {
            alat.tampilkanInfo();
        }
    }
    public void tambahPenyewaan(String nama, String namaAlat, int lama) {
        for (AlatPancing alat : daftarAlat) {
            if (alat.getNama().equalsIgnoreCase(namaAlat)) {
                if (alat.getStok() > 0) {
                    daftarSewa.add(new Penyewaan(nama, alat, lama));
                    alat.setStok(alat.getStok() - 1);
                    System.out.println("Penyewaan berhasil.");
                } else {
                    System.out.println("Stok habis.");
                }
                return;
            }
        }
        System.out.println("Alat tidak ditemukan.");
    }
    public void tampilkanPenyewaan() {
        if (daftarSewa.isEmpty()) {
            System.out.println("Belum ada penyewaan.");
        } else {
            for (Penyewaan p : daftarSewa) {
                p.tampilkanPenyewaan();
            }
        }
    }
    public void kembalikanAlat(String nama) {
        for (int i = 0; i < daftarSewa.size(); i++) {
            if (daftarSewa.get(i).getNamaPenyewa().equalsIgnoreCase(nama)) {
                AlatPancing alat = daftarSewa.get(i).getAlat();
                alat.setStok(alat.getStok() + 1);
                daftarSewa.remove(i);
                System.out.println("Pengembalian berhasil.");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}