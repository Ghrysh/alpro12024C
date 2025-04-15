import java.util.Scanner;

class indexnilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double uts, uas, tugas, hadir;
    double buts=0.3, buas=0.4, btugas=0.25, bhadir=0.05, na;
    String idx="";

    System.out.println("input uts: "); uts=sc.nextDouble();
    System.out.println("input uas: "); uas=sc.nextDouble();
    System.out.println("input tugas: "); tugas=sc.nextDouble();
    System.out.println("input hadir: "); hadir=sc.nextDouble();
    
    // System.out.print("input bobot uts: "); buts=sc.nextDouble();
    // System.out.print("input bobot uas: "); buas=sc.nextDouble();
    // System.out.print("input bobot tugas: "); btugas=sc.nextDouble();
    // System.out.print("input bobot hadir: "); bhadir=sc.nextDouble();
    na=uts*buts+uas*buas+tugas*btugas+hadir*bhadir;

    if (na>=80)
        idx="A";
    else if (na>=75)
        idx="AB";
    else if (na>=70)
        idx="B";
    else if (na>=60)
        idx="BC";
    else if (na<=50)
        idx="D";
    else
        idx="E";

    System.out.println("index nilai= "+idx);
    }
}
