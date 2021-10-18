import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String menu;
        int harga = 0;
        int totalbayar = 0;
        int grandtotal = 0;
        int j = 1;
        int submenu, jml, diskon, bayar, kembali, total;
        ArrayList<Integer> sum = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Program Warung Sederhana");
        System.out.println("Daftar Menu");
        System.out.println("Sate : Ayam, Kambing");
        System.out.println("Pecel : Lauk ayam, Lauk empal");
        System.out.println("Penyetan : Lauk tahu/tempe, Lauk telur, Lauk ayam");
        for (int i = 0; i < j; i++) {
            System.out.print("Pilih menu : ");
            menu = input.next();
            switch (menu) {
                case "Sate":
                    System.out.print("Pilih submenu : ");
                    submenu = input.nextInt();
                    if (submenu == 1) {
                        harga = 1500;
                    } else if (submenu == 2) {
                        harga = 3000;
                    } else {
                        System.out.println("Menu yang dipilih salah/tidak tersedia");
                        System.exit(0);
                    }
                    break;

                case "Pecel":
                    System.out.print("Pilih submenu : ");
                    submenu = input.nextInt();
                    if (submenu == 1) {
                        harga = 13000;
                    } else if (submenu == 2) {
                        harga = 15000;
                    } else {
                        System.out.println("Menu yang dipilih salah/tidak tersedia");
                        System.exit(0);
                    }
                    break;
                case "Penyetan":
                    System.out.print("Pilih submenu : ");
                    submenu = input.nextInt();
                    switch (submenu) {
                        case 1:
                            harga = 5000;
                            break;
                        case 2:
                            harga = 5000;
                            break;
                        case 3:
                            harga = 7000;
                            break;
                        case 4:
                            harga = 10000;
                            break;
                        default:
                            System.out.println("Menu yang dipilih salah/tidak tersedia");
                            break;
                    }
                    break;
                default:
                    System.out.println("Menu yang dipilih salah/tidak tersedia");
                    System.exit(0);
            }
            System.out.print("Masukkan jumlah yang ingin dibeli : ");
            jml = input.nextInt();
            total = jml * harga;
            sum.add(total);
            System.out.print("Apakah ingin beli item lainnya? ");
            boolean b = input.nextBoolean();
            if (b == true) {
                j = j+1;
            }
        }
        System.out.println("Jumlah masing masing item : ");
        for (int c : sum) {
            grandtotal += c;
            System.out.println(c);   
        }
        System.out.println("Jumlah semuanya : "+grandtotal);

        System.out.print("Apakah anda punya member? ");
        boolean member = input.nextBoolean();
        if (member == true) {
            diskon = grandtotal * 5 / 100;
            totalbayar = grandtotal - diskon;
            System.out.println("Jumlah yang harus dibayar = " + totalbayar);
        } else if (member == false) {
            diskon = 0;
            totalbayar = grandtotal - diskon;
            System.out.println("Jumlah yang harus dibayar = " + totalbayar);
        } else {
            System.out.println("Input Salah");
            System.exit(0);
        }

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
