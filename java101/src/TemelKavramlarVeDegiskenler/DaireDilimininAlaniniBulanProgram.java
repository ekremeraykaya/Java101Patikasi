package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireDilimininAlaniniBulanProgram {
    public static void main(String[] args) {

        double pi = 3.14, aci, alan;
        int r;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire diliminin yarı çapını giriniz : ");
        r = input.nextInt();

        System.out.print("Daire diliminin açı ölçüsünü giriniz : ");
        aci = input.nextDouble();

        alan = (pi * (r * r) * aci) / 360;

        System.out.println("Daire diliminin alanı : " + alan);

    }
}
