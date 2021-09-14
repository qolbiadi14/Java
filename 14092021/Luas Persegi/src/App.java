import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menghitung Luas Persegi Panjang");
        Scanner input = new Scanner(System.in);
        int p;
        int l;
        System.out.print("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = input.nextInt();
        int L = p*l;
        System.out.println("Luas persegi panjangnya : " + L);

    }
}
