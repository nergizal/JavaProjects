import java.util.Random;
import java.util.Scanner;

public class sayitahmini {
    public static void main(String[]args){
        int array[]={23,65,78,49,87,34,21,45,90,87}
        int tahmin,can=5; //kullanıcıdan tahmin alacağım için tahmin tanımlıyorum. 5 hakkım var.
         Random rand=new Random(); // rastgele sayı üretmemizi sağlayacak 
         Scanner scan=new Scanner(System.in);
         int sayi=rand.nextInt(100); // bu demek oluyor ki bana 0 ile 100 arasında bir sayı üretecek.
        boolean oyunDurum=false;
        System.out.println("Sayı Tahmini Oyununa Hoşgeldiniz");
        System.out.println("0-99 arasında bir sayı tuttum");
        while(can>0){
            System.out.println("Tahmininiz:");
            tahmin=scan.nextInt();
            if((tahmin<0) || (tahmin>99)) {
              System.out.println("Lütfen 0-99 arasında bir sayı giriniz");
              continue;  // canım gitmeyecek her şeyi başa alıcam.burdan tekrar yukarı çıkıp yapmaya başlayacak, canıbazalmıyor.

            }

            if(tahmin== sayi){
                oyunDurum = true;
                break;
            }else {
                System.out.println("Yanlış, tekrar deneyiniz! Kalan can: " + --can); // canın 1 azalmış halini yazdırması istiyoruz o yüzden -- can dedeik

            }
        }
if(oyunDurum){
    System.out.println("Tebrikler doğru tahmin");
    System.out.println("Sayımız: "+ sayi);
    System.out.println("Kalan can:" + can);
}else {
    System.out.println("Başaramadınız");

}
    }
}


