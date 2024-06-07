package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {

    public static void main(String[] args) {

        double kilo, boy, vucutKitleIndeksi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);
    }
}
