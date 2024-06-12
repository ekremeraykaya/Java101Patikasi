package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisiOdevi {
    public static void main(String[] args) {

        String userName, password, answer, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.print("Şifreniz yanlış ! Şifrenizi sıfırlamak ister misiniz ? ");
            answer = inp.nextLine();

            if (answer.equals("evet")) {
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }

            } else if (answer.equals("hayır")) {
                System.out.println("Şifrenizi sıfırlama önerisini reddettiniz. Giriş yapabilmek için lütfen şifrenizi giriniz.");
            }
        }
    }
}
