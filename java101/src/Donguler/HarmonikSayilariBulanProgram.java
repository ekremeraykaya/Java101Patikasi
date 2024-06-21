package Donguler;

import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        // Java ile girilen sayının harmonik serisini bulan program yazacağız.
        // Harmonik Seri Formülü: 1 + (1/2) + (1/3) + (1/4) + (1/n)

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.println(result);
    }
}
