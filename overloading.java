public class overloading {
    static int(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static double add(int a ,int b, double c){

    }    public static void main(String[]args){
        System.out.println(add(1,2,));
        System.out.println(add(1,2,5));
        System.out.println(add(1,2,7.0));
    }
    //java bunları nasıl ayırt ediyor?->> veri tiplerine göre. add(int,int)->> 2 tane ve int int şeklinde.
    //aynı isme iki metot yazılmaz
}
