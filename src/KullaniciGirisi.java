
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile
 aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı,
 lütfen başka şifre giriniz.
" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi, kullaniciSifre, reset;
        Scanner input = new Scanner(System.in);

        String dogruKullaniciAdi = "patika";
        String dogruSifre = "java123";

        System.out.print("Kullanıcı Adınız: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifreniz: ");
        kullaniciSifre = input.nextLine();

        if (kullaniciAdi.equals(dogruKullaniciAdi) && kullaniciSifre.equals(dogruSifre)) {
            System.out.println("Giriş Başarılı");

        } else if (!kullaniciAdi.equals(dogruKullaniciAdi)) {
            System.out.println("Kullanıcı Adınız Hatalı Tekrar Deneyınız");

        } else if (!kullaniciSifre.equals(dogruSifre)) {

            System.out.println("Şifre Yanlış. Sıfırlamak ister misiiniz?");
            reset = input.nextLine();

            if (reset.toLowerCase().equals("yes") || reset.toLowerCase().equals("evet")) {

                System.out.print("Yeni Şifreniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Sıfırlama işlemi İptal edildi...");
            }
        }
    }
}