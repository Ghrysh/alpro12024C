package pencabangan;

import java.util.Scanner;

class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer A;

        System.out.print("Input Kabisat: "); A=sc.nextInt();
        if (A % 4 == 0)
            System.out.println("kabisat");
        else
            System.out.println("bukan kabisat");
    }
}

