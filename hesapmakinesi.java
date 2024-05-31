import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayı:");
        int a =scan.nextInt();
        
        System.out.print("2.sayı:");
        int b = scan.nextInt();

        System.out.println("İşlem seçiniz");
        System.out.println("1-toplama");
        System.out.println("2- çıkarma");
        System.out.println("3- çarpma");
        System.out.println("4-bölme");
        System.out.print("İşleminiz:");

        int select = scan.nextInt();

        if(select==1){
            System.out.println("Sonuç:" + (a+b));
        } else if(select==2){
            System.out.println("Sonuç:" + (a-b));
        } else if(select==3){
            System.out.println("Sonuç:" + (a*b));
        } else if(select==4){
            if(b==0){
                System.out.println("Bölen sıfır olamaz");
            } else{
            System.out.println("Sonuç:" + (a/b));
        }


    } else {
        System.out.println("Lütfen geçerli bir işlem giriniz");
    }
}
}