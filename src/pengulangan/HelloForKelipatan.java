import java.util.Scanner;

public class HelloForKelipatan {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;

        System.out.println("Berapa kali mengulang?: "); int n = sc.nextInt();
        for(i=0; i <= n; i=i+3)
        {
            System.out.println(i + " Hello World");
        }
        System.err.println(i + " selesai");
    }
}