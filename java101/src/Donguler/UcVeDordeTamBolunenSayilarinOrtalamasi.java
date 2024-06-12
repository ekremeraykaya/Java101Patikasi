package Donguler;

import java.util.Scanner;

public class UcVeDordeTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {

        /*
            Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
            hesaplayan programı yazınız.
        */

        int sayi, toplam = 0, sayac = 0, ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
            }
        }

        ortalama = toplam / sayac;
        System.out.println("Sayıların ortalaması : " + ortalama);
    }
}
