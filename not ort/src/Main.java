import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişken oluştur
        int algoritmaVize;
        int algoritmaFinal;
        // kullanıcıdan not girişi al
        Scanner input = new Scanner(System.in);
        // notların girilmesini isteyeceğiz
        System.out.println("lütfen vize notunu giriniz");
        algoritmaVize = input.nextInt();
            System.out.println("lütfen final notunu giriniz");
            algoritmaFinal = input.nextInt();
            double ortalama = (0.4 * algoritmaVize + 0.6 * algoritmaFinal);
            System.out.println("algoritma not" + ortalama);
        }

    }

