import java.util.Scanner;
public class ders4 {
    public static void main (String[] args) throws Exception {
        //P1
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number=scan.nextInt();

        if(number>=50) System.out.println("Greater than or equals to 50");
        else System.out.println("Less than 50");

       //P2
       System.out.print("Please enter a number:");
       int number1=scan.nextInt();

       if(number1>0) System.out.println("Number1 is positive");//%50
       else if(number1<0) System.out.println("Number is negative");//%50
       else System.out.println("Number is zero");//bu sırayla yazmamız kod süresini kısaltıyor. şansı daha düşük diğer ikisinden
       //P2*version

       //P3
       int dnumber;
       do{
       System.out.print("Please enter a daynumber:");
        dnumber=scan.nextInt();
       }while(dnumber<1 || dnumber>7);

       if(dnumber==1) System.out.println("Monday");
       else if(dnumber==2) System.out.println("Tuesday");
       else if(dnumber==3) System.out.println("Wednesday");
       else if(dnumber==4) System.out.println("Thursday");
       else if(dnumber==5) System.out.println("Friday");
       else if(dnumber==3) System.out.println("Saturday");
       else System.out.println("Sunday");
       //P4
       System.out.print("Please enter two numbers:");
       int n1=scan.nextInt();
       int n2=scan.nextInt();

       if(n1>n2) System.out.println("n1-n2");
       else System.out.println("n2-n1");//eğer ikisi eşitse burda gizli bi condition var. Eşitlik de buraya dahil olur ve 0 printler.

       //P5
       System.out.print("Please enter a grade");
       double grade=scan.nextDouble();
       if(grade==4.0) System.out.println("AA");
       else if(grade>=3.5 ) System.out.println("BA");// 2.part bi conditiona gerek yok çünkü ilkini sağlamadığında alta geçicek zaten
       else if(grade>=3.0) System.out.println("BB");//gizli condiitonlar barındırıyor içinde
       else if(grade>=2.5) System.out.println("CB");
       else if(grade>=2.0) System.out.println("CC");
       else if(grade>=1.5) System.out.println("DC");
       else if(grade>=1.0) System.out.println("DD");
       else if(grade>=0.5) System.out.println("FD");
       else if(grade==0.0) System.out.println("FF");

       //P6
       /* 
       System.out.print("Please enter a grade");
       int sgrade=scan.nextDouble;
       if(sgrade>=90) System.out.println("AA");
       else if(grade>=80) System.out.println("BA");// 2.part bi conditiona gerek yok çünkü ilkini sağlamadığında alta geçicek zaten
       else if(grade>=70) System.out.println("BB");//gizli condiitonlar barındırıyor içinde
       else if(grade>=60) System.out.println("CB");
       else if(grade>=50) System.out.println("CC");
       else if(grade>=40) System.out.println("DC");
       else if(grade>=30) System.out.println("DD");
       else if(grade>=20) System.out.println("FD");
       else  System.out.println("FF");*/
       //homework:write a code to convert base 5 to base 9
       //second homework: result of the operation entered by the user once(+,-,*,/)

       //P7
       Scanner scann =new Scanner(System.in);
       System.out.print("Please enter a number:");
       int numm=scann.nextInt();
       if(numm %2==0) System.out.println("Digit is even");
       else System.out.println("Odd");      
       //P10:ödev

       //Switch-Case
       //P1
       System.out.print("Please enter a number");

       int daynumber=scan.nextInt();

       switch(daynumber){
        case 1: System.out.println("Monday");break;
        case 2: System.out.println("Tuesday");break;
        case 3: System.out.println("Wednesday");break;
        case 4: System.out.println("Thursday");break;
        case 5: System.out.println("Friday");break;
        case 6: System.out.println("Saturday");break;
        case 7:System.out.println("Sunday");break;}
       //P2 ayları sırala

       //P3
       System.out.print("Please enter the number:");

       int num=scan.nextInt();
       switch(num%2){
        case 0: System.out.println("Even");break;
        default: System.out.println("Odd");break;}

        //P4
        System.out.print("Please enter the number:");
        double numberr=scan.nextDouble();

        switch((int)(numberr*10)){
            case 0: System.out.println("FF");break;
            case 5: System.out.println("FD");break;
            case 10: System.out.println("DD");break;
            case 15: System.out.println("CD");break;
            case 20: System.out.println("CC");break;
            case 25: System.out.println("BC");break;
            case 30: System.out.println("BB");break;
            case 35: System.out.println("BA");break;
            case 40: System.out.println("AA");break;}
        
        //P5

        //P6
        System.out.print("Please enter a daynumber:");
        int ddaynumber=scan.nextInt();

        switch(ddaynumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Weekday"); break;
            default:System.out.println("Weekday");
        //P7:homework

        //P9
        System.out.print("Please enter a letter:");
        char c =scan.next().charAt(0);

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("Vowel");break;
    




       

       


}
}}}

 
    
