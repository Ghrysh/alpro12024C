import java.util.Scanner;

public class HelloForN {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;

        System.out.println("Berapa kali mengulang?: "); int n = sc.nextInt();
        for( i=1; i<=n; i++)
        {
            System.out.println(i + " Hello World");
        }
        System.err.println(i + " selesai");
    }
}