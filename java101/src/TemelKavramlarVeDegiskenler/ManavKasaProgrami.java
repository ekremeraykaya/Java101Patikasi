package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutKgDegeri = 2.14, elmaKgDegeri = 3.67, domatesKgDegeri = 1.11, muzKgDegeri = 0.95,
                patlicanKgDegeri = 5.00, toplamTutar = 0.00;

        double armutKacKilo, elmaKacKilo, domatesKacKilo, muzKacKilo, patlicanKacKilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKacKilo = input.nextDouble();
        toplamTutar += (armutKacKilo * armutKgDegeri);

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKacKilo = input.nextDouble();
        toplamTutar += (elmaKacKilo * elmaKgDegeri);

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKacKilo = input.nextDouble();
        toplamTutar += (domatesKacKilo * domatesKgDegeri);

        System.out.print("Muz Kaç Kilo ? : ");
        muzKacKilo = input.nextDouble();
        toplamTutar += (muzKacKilo * muzKgDegeri);

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKacKilo = input.nextDouble();
        toplamTutar += (patlicanKacKilo * patlicanKgDegeri);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
