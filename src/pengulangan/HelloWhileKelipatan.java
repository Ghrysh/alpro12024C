import java.util.Scanner;

public class HelloWhileKelipatan {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;

        System.out.println("Berapa kali mengulang?: "); int n = sc.nextInt();
        i=0;
        while(i <= n)
        {
            System.out.println(i + " Hello World");
            i = i + 3;
        }
        System.err.println(i + " selesai");
    }
}