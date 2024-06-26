package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplamaOdevi {
    public static void main(String[] args) {

        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
        yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
        olmalıdır.

        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

        * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

        * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

        * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/

        int mesafe, yas, yolculukTipi;
        double normalTutar, mesafeBasinaUcret = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi = input.nextInt();

        if (((mesafe > 0) && (yas > 0)) && ((yolculukTipi == 1) || yolculukTipi == 2)) {

            normalTutar = mesafe * mesafeBasinaUcret;

                if (yas < 12)
                    normalTutar = normalTutar - (normalTutar * 0.50);
                else if (yas <= 24)
                    normalTutar = normalTutar - (normalTutar * 0.10);
                else if (yas > 65)
                    normalTutar = normalTutar - (normalTutar * 0.30);
                if (yolculukTipi == 2)
                    normalTutar = (normalTutar - (normalTutar * 0.20)) * 2;

            System.out.println("Toplam Tutar = " + normalTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
