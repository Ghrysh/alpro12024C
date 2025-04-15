package RECORD;

import java.util.Scanner;

class NilaiMK {

    Integer uts, uas, tugas;
    Double na;
    Character idx;

    public static void main(String[] args) {
        NilaiMK M = new NilaiMK(); // inisialisasi melalui konstruktor
        Scanner sc = new Scanner(System.in);

        System.out.print("input uts:");
        M.uts = sc.nextInt();
        System.out.print("input uas:");
        M.uas = sc.nextInt();
        System.out.print("input tugas:");
        M.tugas = sc.nextInt();

        M.na = 0.35 * M.uts + 0.35 * M.uas + 0.3 * M.tugas;
        System.out.print("Nilai " + M.uts + ", " + M.uas + ", " + M.tugas + " Na= " + M.na);

    }
}
