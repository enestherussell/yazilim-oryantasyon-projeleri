import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
            int sayı =input.nextInt();
            int a=1;
            int b=1;
            System.out.println(sayı+"fibonacci sayısı");
            for(int i = 1; i <= sayı; ++i) {
                System.out.print(a + " + ");

                int toplam = a + b;
                a = b;
                b = toplam;


            }
















    }
}