import java.util.Scanner;

class jumlahhari{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer kodeB, tahun, jh;

        System.out.println("input nama bulan : "); kodeB=sc.nextInt();
        System.out.println("input tahun : "); tahun=sc.nextInt();
        switch (kodeB) {
            case 1, 3, 5, 7, 8, 10, 12 -> jh=31;
            case 4, 6, 9, 11 -> jh=30;
            case 2 -> {
                if (tahun % 4== 0){
                    System.out.println("tahun kabisat");
                    jh=29;
                } else
                    jh=28;
            }
            default -> {
                jh=0; System.out.println("kode bulan salah, harusnya 1-12");
            }
        }

            System.out.println("jumlah hari : "+ jh);
    }
}