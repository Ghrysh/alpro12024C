package intro;

import java.util.Scanner;

public class persamaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer r;
        Double k, luas;
        Double phi = 3.14;

        System.out.print("Jari-jari= ");
        r = sc.nextInt();
        k = 2 * phi * r;
        luas = phi * r * r;

        System.out.print("Jari= " + r + ", keliling= " + k + ", Luas= " + luas);
    }
}
// memberi nilai pada "nama"
// memberi nilai pada variable "nama" dengan asignment pada string " ="nama" "
// menambah input output
// Program import otomatis ditambahkan ketika kita memasukkan peritah "Scanner"
// String next batasannya adalah spasi hanya 1 kata
// String nextLine agar bisa 2 kata
// Printlin untuk pindah baris

// Bilangan : bulat/integer = int, tidak bulat/real = float dan double
// Character : char
// String atau kumpulan karakter "Ghryshvi"
// Logic/Boolean = Boolean (True/False)
// Sekali printline bisa pakai 2 variable, pakai koma
// di java ketika menghitung nrp itu misal 243040086 itu dari 0 hingga 8
// seperti kode di atas itu memanggil 24 di nrp nulisanya 0 sampai ke 2, jadi sebelum 2 
// Character pakai petik 1 " ' "
// hasil true didapat dari ekpresi boolean
// sc. "." selanjutnya untuk ditambahkan atribut
