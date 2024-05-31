public class recursivemetot {
    
    static int f(int x){
        int toplam=0;
        for(int i=1; i<=x; i++){
            toplam+=i;
        }
        return toplam;
    }
    static int r(int x){
        if(x==1){ // koşul oluşturmamız gerekiyor, sonsuz döngüye girer yoksa
            return 1;
        }
        return x+ r(x-1);//fonksiyonu kendi içinde bir daha çağırdık

    }
    public static void main (String[]args){
        //özyinelemeli fonksiyonlar
        //fonksiyon içinde kendini bir daha çağıran fonksiyonlara denir
        //f(1)=2
        //f(2)=f(1)+2
        //f(3)=f(2)+3
        //...
        //f(6)=f(5)+6
        //f(7)=f(6)+7
        System.out.println(r(10));
    }
}
