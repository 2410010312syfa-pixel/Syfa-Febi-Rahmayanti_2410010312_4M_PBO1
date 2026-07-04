# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana **Sistem Penyewaan Alat Pancing** yang dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini dibuat untuk membantu proses penyewaan alat pancing secara sederhana melalui Java Console. Pengguna dapat melihat daftar alat yang tersedia, melakukan penyewaan, mengembalikan alat yang telah dipinjam,
serta melihat data penyewaan yang sudah dilakukan. Program ini dibuat dengan menerapkan konsep-konsep dasar Object Oriented Programming (OOP), seperti Class, Object, Attribute, Constructor, Mutator, 
Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, Array menggunakan ArrayList, dan Error Handling.


# Penjelasan Kode

Berikut merupakan beberapa konsep OOP yang diterapkan pada program.

## 1. Class

Program ini terdiri dari beberapa class yang memiliki fungsi masing-masing, yaitu:

- `AlatPancing`
- `Joran`
- `Reel`
- `Penyewaan`
- `DataPancing`
- `Main`

```java
public class AlatPancing {

}

public class Penyewaan {

}

public class Main {

}
```

## 2. Object

Object digunakan agar class dapat dijalankan di dalam program.

```java
DataPancing data = new DataPancing();
```

dan

```java
Penyewaan sewa = new Penyewaan(nama, alat, lama);
```

## 3. Attribute

Attribute digunakan untuk menyimpan data pada setiap class.

Contohnya pada class `AlatPancing`.

```java
private String nama;
private int harga;
private int stok;
```

Sedangkan pada class `Penyewaan`.

```java
private String namaPenyewa;
private AlatPancing alat;
private int lamaSewa;
private int totalBayar;
```

## 4. Constructor

Constructor digunakan untuk memberikan nilai awal saat object dibuat.

```java
public AlatPancing(String nama, int harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}
```

```java
public Penyewaan(String namaPenyewa, AlatPancing alat, int lamaSewa) {
    this.namaPenyewa = namaPenyewa;
    this.alat = alat;
    this.lamaSewa = lamaSewa;
}
```

## 5. Mutator (Setter)

Setter digunakan untuk mengubah nilai suatu atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(int harga) {
    this.harga = harga;
}

public void setStok(int stok) {
    this.stok = stok;
}
```

Setter juga digunakan untuk mengurangi dan menambah stok alat saat proses penyewaan maupun pengembalian.


## 6. Accessor (Getter)

Getter digunakan untuk mengambil nilai dari atribut.

```java
public String getNama() {
    return nama;
}

public int getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}
```

Getter digunakan saat program ingin menampilkan informasi alat maupun menghitung total biaya penyewaan.


## 7. Encapsulation

Konsep Encapsulation diterapkan dengan membuat seluruh atribut menjadi `private`, sehingga data hanya dapat diakses melalui method getter dan setter.

```java
private String nama;
private int harga;
private int stok;
```


## 8. Inheritance

Konsep Inheritance diterapkan pada class `Joran` dan `Reel` yang merupakan turunan dari class `AlatPancing`.

```java
public class Joran extends AlatPancing {

}

public class Reel extends AlatPancing {

}
```

Dengan inheritance, class turunan dapat menggunakan atribut dan method dari class induknya.


## 9. Polymorphism

Polymorphism diterapkan dengan melakukan **method overriding** pada method `tampilkanInfo()`.

```java
@Override
public void tampilkanInfo() {
    System.out.print("[JORAN] ");
    super.tampilkanInfo();
}
```

Method tersebut akan menampilkan informasi alat sesuai dengan jenis alatnya.

## 10. Seleksi

Program menggunakan percabangan `if` untuk mengecek apakah stok alat masih tersedia.

```java
if (alat.getStok() > 0) {

}
```

Sedangkan `switch` digunakan untuk memilih menu pada program.

```java
switch(pilih){

}
```

## 11. Perulangan

Program menggunakan perulangan `for` untuk menampilkan daftar alat dan data penyewaan.

```java
for (AlatPancing alat : daftarAlat) {

}
```

Program juga menggunakan `do-while` agar menu terus ditampilkan sampai pengguna memilih keluar.

```java
do{

}while(pilih != 5);
```

## 12. Input Output Sederhana

Program menggunakan class `Scanner` untuk menerima input dari pengguna.

```java
Scanner input = new Scanner(System.in);
```

Sedangkan output ditampilkan menggunakan `System.out.println()`.

```java
System.out.println("===== SISTEM PENYEWAAN ALAT PANCING =====");
```

## 13. Array

Program menggunakan `ArrayList` untuk menyimpan data.

```java
ArrayList<AlatPancing> daftarAlat = new ArrayList<>();
```

Digunakan untuk menyimpan daftar alat pancing.

```java
ArrayList<Penyewaan> daftarSewa = new ArrayList<>();
```

Digunakan untuk menyimpan data penyewaan.

## 14. Error Handling

Program menggunakan `try-catch` untuk mengatasi kesalahan input dari pengguna.

```java
try{

}catch(Exception e){

    System.out.println("Input harus angka!");

}
```

Dengan adanya `try-catch`, program tidak langsung berhenti ketika pengguna salah memasukkan input.

# Usulan Nilai

| No | Materi | Nilai |
| 1 | Class | 5 |
| 2 | Object | 5 |
| 3 | Attribute | 5 |
| 4 | Constructor | 5 |
| 5 | Mutator | 5 |
| 6 | Accessor | 5 |
| 7 | Encapsulation | 5 |
| 8 | Inheritance | 5 |
| 9 | Polymorphism | 10 |
| 10 | Seleksi | 5 |
| 11 | Perulangan | 5 |
| 12 | IO Sederhana | 10 |
| 13 | Array (ArrayList) | 15 |
| 14 | Error Handling | 15 |
| | **TOTAL** | **100** |

# Pembuat

**Nama:** Syfa Febi Rahmayanti
**NPM:** 2410010312
