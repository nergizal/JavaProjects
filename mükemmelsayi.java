import java.util.Scanner;
public class mükemmelsayi {
    public static void main(String[]args){
        //mükemmel sayı:kendisi hariç pozitif tam bölenlerinin toplamının kendisine eşit olması durumudur.
        // örn:28: 1,2,7,14->> 28
        //ilk önce sayının pozitif tam sayı bölenlerini bulammız gerekiyor
        Scanner input=new Scanner (System.in);

        System.out.print("Bir sayı giriniz:");
        int n= input.nextInt();
        int total=0;

        for(int i=1; i<n; i++){// i=1 dedik çünkü bir sayı 0'a bölünemez belirsizlik olur
        //i<n diyoruz küçük eşit demiyoruz çünkü kendisini istemiyoruz.
        if(n%i==0){
            total+=i;
        }
        }
        if(total==n){
            System.out.println(n + "Sayısı mükemmel bir sayıdır");
        } else{
            System.out.println(n + "Sayısı mükemmel b, sayı değildir");
        }
    }
    
}
