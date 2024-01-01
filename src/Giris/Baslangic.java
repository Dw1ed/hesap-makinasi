
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args)  {
        int number1, number2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        number1 = inp.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        number2 = inp.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma: " + (number1 * number2));
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez!");
                    break;
                }
                System.out.println("Bölme: " + (number1 / number2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
        }

    }
}
