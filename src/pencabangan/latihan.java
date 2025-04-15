package pencabangan;

import java.util.Scanner;

public class latihan {
    // Deklarasi variabel
    String kode;
    String nama;
    double harga;
    double diskon;
    double hargaJual;

    public void hitungHargaJual() {
        hargaJual = harga - (harga * diskon / 100);
    }

    public void tampilkanInfo() {
        System.out.println("Kode Produk: " + kode);
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga Normal: " + harga);
        System.out.println("Selamat anda mendapatkan diskon sebesar " + diskon + "%");
        System.out.println("Total harga belanja anda menjadi " + hargaJual);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        latihan produk = new latihan();

        System.out.print("Masukkan Kode Produk: ");
        produk.kode = scanner.nextLine();
        System.out.print("Masukkan Nama Produk: ");
        produk.nama = scanner.nextLine();
        System.out.print("Masukkan Harga Produk: ");
        produk.harga = scanner.nextDouble();
        System.out.print("Masukkan Diskon (%): ");
        produk.diskon = scanner.nextDouble();

        produk.hitungHargaJual();

        produk.tampilkanInfo();

        scanner.close();
    }
}