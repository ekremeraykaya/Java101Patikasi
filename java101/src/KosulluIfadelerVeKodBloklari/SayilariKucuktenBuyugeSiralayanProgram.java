package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralayanProgram {
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        n3 = input.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println("n1 < n2 < n3");
            } else {
                System.out.println("n1 < n3 < n2");
            }
        } else if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("n2 < n1 < n3");
            } else {
                System.out.println("n2 < n3 < n1");
            }
        } else {
            if (n1 < n2) {
                System.out.println("n3 < n1 < n2");
            } else {
                System.out.println("n3 < n2 < n1");
            }
        }
    }
}
