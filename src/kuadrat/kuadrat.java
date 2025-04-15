package kuadrat;

import java.util.Scanner;

public class kuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
            
        double diskriminan = b * b - 4 * a * c;
        
        if (diskriminan > 0) {
            double x1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Persamaan kuadrat memiliki dua solusi real:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (diskriminan == 0) {
            
            double x = -b / (2 * a);
            System.out.println("Persamaan kuadrat memiliki satu solusi real:");
            System.out.println("x = " + x);
        } else {
            
            System.out.println("Persamaan kuadrat tidak memiliki solusi real.");
        }
        
        scanner.close();
    }
}