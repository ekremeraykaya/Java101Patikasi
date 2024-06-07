package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvTutariHesaplamaOdevi {
    public static void main(String[] args) {

        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        boolean durum = (tutar >= 0) && (tutar <= 1000);

        double kdvOrani = durum ? kdvOrani1 : kdvOrani2;

        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
        
    }
}
