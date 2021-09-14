import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        final float disc = (float)0.05;
        String jenisBeras;
        int harga = 0;
        float jml,byr;

        System.out.println("Program kasir warung sederhana");
        System.out.println("------------------------------");
        System.out.println("Beras yang tersedia : Rojo Lele, Pandan Wangi, Setra");

        System.out.print("Pilih beras yang akan dibeli : ");
        jenisBeras = input.nextLine();
        switch (jenisBeras) {
            
            case "Rojo Lele":
                harga = 10000;
                System.out.println("Harga Beras yang Dipilih : " + harga);
                break;
            case "Pandan Wangi":
                harga = 12000;
                System.out.println("Harga Beras yang Dipilih : " + harga);
                break;
            case "Setra":
                harga = 9000;
                System.out.println("Harga Beras yang Dipilih : " + harga);
                break;
            default:
                System.out.println("Beras Tidak Tersedia atau Salah");
                return;
        }

        System.out.print("Masukkan jumlah yang ingin dibeli dalam kilogram : ");
        jml = input.nextFloat();
        float total = harga * jml;
        System.out.println("Total belanja anda : " + total);

        float hargaAkhir = total - (total * disc);
        System.out.println("Harga yang harus dibayar : " + hargaAkhir);

        System.out.print("Bayar : ");
        byr = input.nextInt();
        if (byr < hargaAkhir) {
            System.out.println("Uang Tidak Cukup");
        } else if (byr - hargaAkhir == 0){
            System.out.println("Terimakasih telah belanja di toko kami");
        } else {
            float tbayar = byr - hargaAkhir;
            System.out.println("Jumlah kembalian : " + tbayar);
            System.out.println("Terimakasih telah belanja di toko kami");
        }
        
    }
}
