import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int pilih = 0;
        int index = 0;
        int totalbayar = 0;
        int bayar, kembali;
        ArrayList<String> menu = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        ArrayList<Integer> jml = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Daftar Menu");
            System.out.println("1. Sate [15.000]");
            System.out.println("2. Soto [10.000]");
            System.out.println("3. Rawon [12.000]");
            System.out.println("4. Pecel [8.000]");
            System.out.println("5. Bakso [10.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    menu.add("Sate ");
                    harga.add(15000);
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml.add(input.nextInt());
                    total.add(jml.get(index) * harga.get(index));
                    break;
                case 2:
                    menu.add("Soto ");
                    harga.add(10000);
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml.add(input.nextInt());
                    total.add(jml.get(index) * harga.get(index));
                    break;
                case 3:
                    menu.add("Rawon");
                    harga.add(12000);
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml.add(input.nextInt());
                    total.add(jml.get(index) * harga.get(index));
                    break;
                case 4:
                    menu.add("Pecel");
                    harga.add(8000);
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml.add(input.nextInt());
                    total.add(jml.get(index) * harga.get(index));
                    break;
                case 5:
                    menu.add("Soto ");
                    harga.add(10000);
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jml.add(input.nextInt());
                    total.add(jml.get(index) * harga.get(index));
                    break;
                
                default:
                    break;
            }
            index++;
        } while (pilih != 6);
        
        System.out.println("Daftar Belanja");
        for (int i = 0; i < index-1; i++) {
            System.out.println((i+1)+". "+menu.get(i)+"\t Rp. "+harga.get(i)+"\t Jumlah = "+jml.get(i)+"\t Total = "+total.get(i));
        }
        for (int t : total) {
            totalbayar += t;
        }
        System.out.println("Total Belanja : "+totalbayar);
        System.out.print("Masukkan Jumlah Bayar : ");
        bayar = input.nextInt();
        if (bayar < totalbayar) {
            System.out.println("Uang tidak mencukupi");
        } else if (bayar > totalbayar) {
            kembali = bayar - totalbayar;
            System.out.println("Kembalian = " + kembali);
            System.out.println("Terimakasih sudah belanja");
        } else if (bayar == totalbayar) {
            System.out.println("Terimakasih sudah belanja");
        }
        input.close();
    }
}
