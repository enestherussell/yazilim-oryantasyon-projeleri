import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("lütfen sayı giriniz");
        int binler, yuzler, onlar, birler;
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        //binler basamağı
        binler = sayi / 1000;
        sayi = sayi - (1000 * binler);
        //yüzler basamağı
        yuzler = sayi / 100;
        sayi = sayi - (100 * yuzler);
        //onlar basamağı
        onlar = sayi / 10;
        sayi = sayi - (10 * onlar);
        //birler basamağı
        birler = sayi;

        System.out.println("Sayının Basamaklarına Ayrılmış Hali " + binler + " " + yuzler + " " + onlar + " " + birler);
        System.out.println("Binler Basamağı : " + binler);
        System.out.println("Yüzler Basamağı : " + yuzler);
        System.out.println("Onlar Basamağı  : " + onlar);
        System.out.println("Birler Basamağı : " + birler);

    }
}



















