import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int jml,diskon,hargabrg,total,bayar,kembali;
        int hargatotal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Program Kasir If Else");
        System.out.print("Masukkan Jumlah Barang : ");
        jml = input.nextInt();
        System.out.print("Masukkan Harga Barang : ");
        hargabrg = input.nextInt();
        total = jml * hargabrg;
        System.out.println("Total harga : "+total);
        if (total < 100000 && total >= 0) {
            diskon = 0;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        } else if (total > 100000 && total <= 200000){
            diskon = 5;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        } else if (total > 200000 && total <= 300000){
            diskon = 10;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        } else if (total > 300000 && total <= 400000){
            diskon = 15;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        } else if (total > 400000 && total <= 500000){
            diskon = 20;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        } else if (total > 500000){
            diskon = 25;
            hargatotal = total - (total*diskon/100);
            System.out.println("Anda mendapatkan diskon sebesar "+diskon+"%");
            System.out.println("Jumlah yang harus dibayar : "+hargatotal);
        }

        System.out.print("Masukkan jumlah pembayaran : ");
        bayar = input.nextInt();
        if (bayar < hargatotal) {
            System.out.println("Uang tidak mencukupi");
        } else if (bayar > hargatotal) {
            kembali = bayar - hargatotal;
            System.out.println("Kembalian = "+kembali);
            System.out.println("Terimakasih sudah belanja");
        } else if (bayar == hargatotal) {
            System.out.println("Terimakasih sudah belanja");
        }
        input.close();
    }
}
