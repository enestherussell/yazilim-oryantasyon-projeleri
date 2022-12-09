import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b,işlem;

        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        a  =input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        b = input.nextInt();

        System.out.println("1-toplama\2-çıkarma\3-çarpma\4-bölme");
        işlem=input.nextInt();
        System.out.println(işlem);
        if (işlem == 1){
            System.out.println("toplam:"+(a+b) );
        } else if (işlem==2) {
            System.out.println("çıkarma:"+(a-b));
        } else if (işlem==3) {
            System.out.println("çarpma:"+(a*b));
        }
        else{
            System.out.println("bölme:"+(a/b));
        }
    }
}