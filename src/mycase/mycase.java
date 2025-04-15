package mycase;

import java.util.Scanner;

class mycase{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer kodeB;
        String namaB;

        System.out.println("input nama bulan : "); kodeB=sc.nextInt();
        switch (kodeB) {
            case 1 -> namaB="Januari";
            case 2 -> namaB="Februari";
            case 3 -> namaB="Maret";
            case 4 -> namaB="April";
            case 5 -> namaB="Mei";
            case 6 -> namaB="Juni";
            case 7 -> namaB="Juli";
            case 8 -> namaB="Agustus";
            case 9 -> namaB="September";
            case 10 -> namaB="Oktober";
            case 11 -> namaB="November";
            case 12 -> namaB="Desember";

            default -> {
                namaB=""; System.out.println("kode bulan salah, harusnya 1-12");
            }
        }

            System.out.println("nama bulannya adalah: "+ namaB);
    }
}