import java.util.Scanner;

public class Sekuensial {
    public static void main(String args[]) {
        // gaji total = Gaji pokok + (jumlah masuk * 15000) + tunjangan
        // tunjangan = gaji pokok + 5%
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikasi Gaji Karyawan");
        int gaji_pokok=4000000;
        int jumlahmasuk;
        double tunjangan, gajitotal;

        jumlahmasuk = 22;
        tunjangan = gaji_pokok * 0.05;
        gajitotal  = gaji_pokok + (jumlahmasuk * 15000) + tunjangan;

        System.out.println("Gaji Pokok : " + gaji_pokok);
        System.out.println("Transport : " + (jumlahmasuk * 15000));
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji Pegawai : " + gajitotal);
    }
}
