import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String a = "Data Mahasiswa";
        String nama;
        String npm;
        double ipk;
        int semester;
        System.out.println(a);
        System.out.print("Nama : ");
        nama = input.next();
        System.out.print("NPM : ");
        npm = input.next();
        System.out.print("IPK : ");
        ipk = input.nextDouble();
        System.out.print("Semester : ");
        semester = input.nextInt();
    }
}
