package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class CinZodyagiHesaplamaOdevi {
    public static void main(String[] args) {

        /*
        
        Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve
        sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı
        bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

*/

        int dogumYili, deger;
        String cinZodyagiBurcu = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili = input.nextInt();

        deger = dogumYili % 12;

        switch (deger) {
            case 0:
                cinZodyagiBurcu = "Maymun";
                break;
            case 1:
                cinZodyagiBurcu = "Horoz";
                break;
            case 2:
                cinZodyagiBurcu = "Köpek";
                break;
            case 3:
                cinZodyagiBurcu = "Domuz";
                break;
            case 4:
                cinZodyagiBurcu = "Fare";
                break;
            case 5:
                cinZodyagiBurcu = "Öküz";
                break;
            case 6:
                cinZodyagiBurcu = "Kaplan";
                break;
            case 7:
                cinZodyagiBurcu = "Tavşan";
                break;
            case 8:
                cinZodyagiBurcu = "Ejderha";
                break;
            case 9:
                cinZodyagiBurcu = "Yılan";
                break;
            case 10:
                cinZodyagiBurcu = "At";
                break;
            case 11:
                cinZodyagiBurcu = "Koyun";
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız !");
        }

        System.out.println("Çin Zodyağı Burcunuz : " + cinZodyagiBurcu);
    }
}
