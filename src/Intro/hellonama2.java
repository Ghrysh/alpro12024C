package intro;

import java.util.Scanner;

public class hellonama2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nrp, nama;
        Integer umur;
        Character jk;
        String subString;
        Boolean kost;
        Character jawab;
        Float uangsaku;

        System.out.print("Ketikkan nama: ");
        nama = sc.nextLine();

        System.out.print("Ketikkan nrp: ");
        nrp = sc.next();

        subString = nrp.substring(0, 2);

        System.out.print("Ketikkan Umur: ");
        umur = sc.nextInt();

        System.out.print("Ketikkan Jenis Kelamin: ");
        jk = sc.next().charAt(0);

        System.out.print("Apakah tinggal di kost? (y/n): ");
        jawab = sc.next().charAt(0);
        kost = (jawab == 'y');

        System.out.print("Berapa uang saku mu?: ");
        uangsaku = sc.nextFloat();

        System.out.println("Hello " + nama + ", " + nrp + ", " + subString);
        System.out.println("Umurmu " + umur + " tahun");
        System.out.println("Gender " + jk);
        System.out.println("Kost " + kost);
        System.out.println("Uang Saku : Rp " + uangsaku + ",-");
        Float harian = uangsaku / 30;
        System.out.println("Uang Harian : Rp " + harian + ",-");
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
