package Soal3;

// Nama : Surya Putra HS
// NIM  : 2902792001

// Soal 2: Menerapkan Enkapsulasi dan Method

// Kelas Mahasiswa
public class Mahasiswa {
    // Atribut kelas
    String nama;
    String nim;
    String jurusan;

    // ubah atribut ipk jadi private
    private double ipk;

    // Constructor sebagai inisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }


    // getter dan setter untuk mengakses serta memperbarui nilai ipk
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // method cekKelulusan() untuk menampilkan status kelulusan
    public String cekKelulusan() {
        if (this.ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // method hitungPredikat() untuk menentukan predikat akademik mahasiswa berdasarkan nilai IPK
    public String hitungPredikat() {
        if (this.ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (this.ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (this.ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }

    // Method tampilkanInfo() untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("IPK     : " + this.ipk);
        // Tampilkan status kelulusan
        System.out.println("Status  : " + this.cekKelulusan());
        // Tampilkan predikat akademik baru
        System.out.println("Predikat : " + this.hitungPredikat());
        System.out.println("---------------------------------");
    }

}
