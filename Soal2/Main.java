package Soal2;
import java.util.Scanner;
import java.util.Locale;

// Kelas Utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ubah penggunaan koma(,) jadi koma (.)
        input.useLocale(Locale.US);
        // 5 objek mahasiswa dengan data berbeda

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[5];
        daftarMahasiswa[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftarMahasiswa[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftarMahasiswa[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftarMahasiswa[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftarMahasiswa[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        // Cari dan update IPK dengan input NIM
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = input.nextDouble();

        boolean ditemukan = false;

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.nim.equals(nimCari)) {
                // Menggunakan setter untuk memperbarui nilai ipk private
                mhs.setIpk(ipkBaru);
                ditemukan = true;

                // 5. Menampilkan kembali informasi setelah sukses diperbarui
                System.out.println("Data berhasil diperbarui!\n");
                System.out.println("=== Data Mahasiswa ===");
                mhs.tampilkanInfo();
                break; // Keluar dari loop setelah data ditemukan
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }

        input.close();
    }
}

