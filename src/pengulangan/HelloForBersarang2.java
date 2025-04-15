import java.util.Scanner;

public class HelloForBersarang2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Berapa kali mengulang?: "); 
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j--) {
            System.out.print(j);
        }
            System.out.println();
        }
        System.out.println("Selesai");
    }
}