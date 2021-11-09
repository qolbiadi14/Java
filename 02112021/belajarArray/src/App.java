import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String makanan[];
        makanan = new String[5];
        int harga[] = new int[5];
        int [] jml = new int[5];
        int totalbayar[] = new int[5];
        int bayar, kembali;
        int index=0; //index array
        int pilih=0;
        int total=0;
        int gt=0;
        do {
            System.out.println("Daftar Menu");
            System.out.println("1. Sate [15.000]");
            System.out.println("2. Soto [10.000]");
            System.out.println("3. Rawon [12.000]");
            System.out.println("4. Pecel [8.000]");
            System.out.println("5. Bakso [10.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    makanan[index] = "Sate ";
                    harga[index] = 15000;
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml[index] = s.nextInt();
                    total=total+15000;
                    break;
                case 2:
                    makanan[index] = "Soto ";
                    harga[index] = 10000;
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml[index] = s.nextInt();
                    total=total+10000;
                    break;
                case 3:
                    makanan[index] = "Rawon";
                    harga[index] = 12000;
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml[index] = s.nextInt();
                    total=total+12000;
                    break;
                case 4:
                    makanan[index] = "Pecel";
                    harga[index] = 8000;
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml[index] = s.nextInt();
                    total=total+8000;
                    break;
                case 5:
                    makanan[index] = "Bakso";
                    harga[index] = 10000;
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml[index] = s.nextInt();
                    total=total+10000;
                    break;
                
                default:
                    break;
            }
            index++;
        } while (pilih != 6);
        //menampilkan makanan yang dibeli
        System.out.println("Daftar Belanja");
        for (int i = 0; i < index-1; i++) {
            System.out.println((i+1)+". "+makanan[i]+"\t Rp. "+harga[i]+"\t Rp. "+harga[i]*jml[i]);
            totalbayar[i] = harga[i]*jml[i];
        }

        for (int tot : totalbayar) {
            gt += tot;
        }
        System.out.println("Total Belanja : "+gt);
        System.out.print("Masukkan Jumlah Bayar : ");
        bayar = s.nextInt();
        if (bayar < gt) {
            System.out.println("Uang tidak mencukupi");
        } else if (bayar > gt) {
            kembali = bayar - gt;
            System.out.println("Kembalian = " + kembali);
            System.out.println("Terimakasih sudah belanja");
        } else if (bayar == gt) {
            System.out.println("Terimakasih sudah belanja");
        }
        s.close();
    }
}
