package Soal3;

import java.util.Locale;
import java.util.Scanner;

// Kelas Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ubah penggunaan koma(,) jadi koma (.)
        input.useLocale(Locale.US);

        // 5 objek mahasiswa dengan data berbeda dalam array

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[5];
        daftarMahasiswa[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftarMahasiswa[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftarMahasiswa[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftarMahasiswa[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftarMahasiswa[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        input.close();

        System.out.println("=== DATA MAHASISWA ===");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanInfo();
        }
    }
}

