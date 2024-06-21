package Donguler;

import java.util.Scanner;

public class BirSayininBasamakSayilarininToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();

        int basValue;
        int result = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamak sayılarının toplamı : " + result);
    }
}
