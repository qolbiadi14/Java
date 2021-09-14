import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Menghitung Umur Mahasiswa");
        Scanner input = new Scanner(System.in);
        int thnIni = 2021;
        int thnLhr; 
        System.out.print("Masukkan tahun lahir anda : ");
        thnLhr = input.nextInt();
        int umur = thnIni - thnLhr;
        System.out.println("Umur anda "+ umur + " tahun");
    }
}
