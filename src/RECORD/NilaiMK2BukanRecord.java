package RECORD;

import java.util.Scanner;

class NilaiMK2BukanRecord {

    Integer uts, uas, tugas;
    Double na;
    Character idx;

    public static void main(String[] args) {
        NilaiMK2BukanRecord M = new NilaiMK2BukanRecord(); // inisialisasi melalui konstruktor
        Scanner sc = new Scanner(System.in);

        System.out.print("input uts:");
        uts = sc.nextInt();
        System.out.print("input uas:");
        uas = sc.nextInt();
        System.out.print("input tugas:");
        tugas = sc.nextInt();

        M.na = 0.35 * M.uts + 0.35 * M.uas + 0.3 * M.tugas;
        System.out.print("Nilai " + M.uts + ", " + M.uas + ", " + M.tugas + " Na= " + M.na);

    }
}
