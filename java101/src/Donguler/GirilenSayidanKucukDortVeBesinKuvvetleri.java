package Donguler;

import java.util.Scanner;

public class GirilenSayidanKucukDortVeBesinKuvvetleri {
    public static void main(String[] args) {

        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
    */

        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();


        System.out.println("Dördün Katları : ");
        System.out.println("------------------");

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Beşin Katları : ");
        System.out.println("------------------");

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }

}

