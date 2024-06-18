package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {

        /*
         N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
         olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)

        */

        int n, r;
        double total1 = 1, total2 = 1, total3 = 1, kombinasyon;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kümenin eleman sayısını giriniz : ");
        n = input.nextInt();

        System.out.print("Lütfen oluşturulacak r elemanlı farklı grupların sayısını giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 = total1 * i;
        }

        for (int i = 1; i <= r; i++) {
            total2 = total2 * i;
        }

        int islem = n - r;

        for (int i = 1; i <= islem; i++) {
            total3 = total3 * i;
        }

        kombinasyon = total1 / (total2 * total3);

        System.out.println("N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı : " + kombinasyon);
    }
}
