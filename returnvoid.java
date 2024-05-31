public class returnvoid {
   static int power(int a ,int b){
    int result=1;
    for(int i=1; i<=b; i++){
        result *=a;
    }
    return result;// döndürdüğüm değer çıkar
   } // bir fonksiyon çalıştığında geriye bir şey döndürmesin istiyorsak void kullanırız(ekrana yazdırmalı şeylerde genelde).
   //geriye bir değer döndürmesini istiyorsak returnlü fonlsiyon tanımlarız. o fonksiyondan önce döndüreceği verinin tipini belirliyoruz.
   static void power2(int a , int b){
    int result=1;
    for(int i=11; i<=b; i++){
        result*=a;
    }
    System.pout.println(result);
   }
   public static void main(String[]args){
    int r2= power(10,2);
    System.out.println(r2);
   } 
}
