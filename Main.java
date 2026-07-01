package penyewaanalatpancing;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataPancing data = new DataPancing();
        int pilih;
        do {
            System.out.println("\n===== SISTEM PENYEWAAN ALAT PANCING =====");
            System.out.println("1. Lihat Daftar Alat");
            System.out.println("2. Sewa Alat");
            System.out.println("3. Kembalikan Alat");
            System.out.println("4. Lihat Data Penyewaan");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            
            try {
                pilih = input.nextInt();
                input.nextLine();
                switch (pilih) {
                    case 1:
                        data.tampilkanAlat();
                        break;
                    case 2:
                        System.out.print("Nama Penyewa : ");
                        String nama = input.nextLine();

                        System.out.print("Nama Alat : ");
                        String alat = input.nextLine();

                        System.out.print("Lama Sewa : ");
                        int lama = input.nextInt();
                        
                        data.tambahPenyewaan(nama, alat, lama);
                        break;
                    case 3:
                        System.out.print("Nama Penyewa : ");
                        data.kembalikanAlat(input.nextLine());
                        break;
                    case 4:
                        data.tampilkanPenyewaan();
                        break;
                    case 5:
                        System.out.println("Terima Kasih.");
                        break;
                    default:
                        System.out.println("Menu tidak tersedia.");
                }
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                input.nextLine();
                pilih = 0;
            }
        } while (pilih != 5);
    }
}