package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {

        // Scanner sınıfını tanımla.
        Scanner inp = new Scanner(System.in);

        // Değişkenleri oluştur.
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız: " + sonuc);

        boolean durum = sonuc > 60.0;

        String sinifGecmeDurumu = durum ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifGecmeDurumu);

    }
}
