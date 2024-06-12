package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int mat, fizik, turkce, kimya, muzik;
        double toplamDers = 5.0, dersAzalt = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            dersAzalt++;
            System.out.println("Lütfen geçerli bir not giriniz !");
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersAzalt++;
            System.out.println("Lütfen geçerli bir not giriniz !");
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            dersAzalt++;
            System.out.println("Lütfen geçerli bir not giriniz !");
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            dersAzalt++;
            System.out.println("Lütfen geçerli bir not giriniz !");
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            dersAzalt++;
            System.out.println("Lütfen geçerli bir not giriniz !");
        }

        double average = (mat + fizik + turkce + kimya + muzik) / (toplamDers - dersAzalt);

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere !");
        } else {
            System.out.println("Tebrikler,sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız : " + average);
    }
}
