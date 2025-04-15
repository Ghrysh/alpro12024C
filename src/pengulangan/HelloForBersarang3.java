import java.util.Scanner;

public class HelloForBersarang3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Berapa kali mengulang?: "); 
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
            System.out.print(j+" ");
        }
            System.out.println();
        }
        System.out.println("Selesai");
    }
}