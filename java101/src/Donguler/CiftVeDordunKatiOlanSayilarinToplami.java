package Donguler;

import java.util.Scanner;

public class CiftVeDordunKatiOlanSayilarinToplami {
    public static void main(String[] args) {

        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    */

        int num, total = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Lütfen bir sayı giriniz : ");
            num = scan.nextInt();

            if (num % 2 == 1) {
                break;
            }

            if (num % 4 == 0) {
                total += num;
            }
        }

        System.out.println("Girilen sayıların toplamı : " + total);

    }
}
