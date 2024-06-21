package Donguler;

import java.util.Scanner;

public class YildizlarIleElmasYapimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        // Üst kısım
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
        // Alt kısım
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
