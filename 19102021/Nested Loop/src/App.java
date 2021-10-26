import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Pengulangan bersarang");
        int a = 2;
        int b = 0;
        int n;
        System.out.print("Masukkan jumlah deret : ");
        n = input.nextInt();
        while(b < n){
            int c = 0;
            for (int i=1; i<= a; i++){
                if(a%i==0){
                    c++;
                }
            }
            if(c==2){
                System.out.print(a+" ");
                b++;
            }
            a++;
          }
        input.close();
    }
}
