public class palindrom {
    static boolean isPalindrom(int input){ //palindrommu değil mi demek oluyor
        int temp, terssayi=0, kalan;
        temp=input;

        while(temp !=0){
            kalan=temp%10;
            terssayi=terssayi*10 + kalan;
            temp/=10;
        }
        if(input==terssayi)
            return true;
        else
            return false;

    }
    public static void main(String[]args){
        //123321
        // 121%10=1   terssayi =1 yapıyoruz->> birler basamağını bulabilmek için
        //121/10=12 alıcaz
        //12%10=2, terssayi=terssayi*10+2=12/10=1
        // 1%10=1, terssayi= terssayi*10+1=121
        System.out.println(isPalindrom(1253));
    }
}
