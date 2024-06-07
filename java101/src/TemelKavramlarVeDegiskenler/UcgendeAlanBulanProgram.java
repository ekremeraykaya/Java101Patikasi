package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class UcgendeAlanBulanProgram {
    public static void main(String[] args) {
        int a, b, c;
        double u, cevre, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1. Kenar Uzunluğunu Giriniz : ");
        a = input.nextInt();

        System.out.print("Üçgenin 2. Kenar Uzunluğunu Giriniz : ");
        b = input.nextInt();

        System.out.print("Üçgenin 3. Kenar Uzunluğunu Giriniz : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);

    }
}
