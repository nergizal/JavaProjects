import java.util.Scanner;
public class ders3 {
    public static void main (String[] args) throws Exception {
         //P1
       int i=1;
       while(i<100)
        System.out.println(i++);
        //P2:Display sum of natural numbers until n entered by the user
        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter a number:");
        int sum=0, number=scan.nextInt();

        for(int k=1; k<=number; k++)
          sum+=k;
        System.out.println("The result is "+sum+".");

       //P3:Display factorial value of n entered by the user
       Scanner sc = new Scanner(System.in);

       System.out.println("Please enter a number:");
       int factorial=1, numberr=sc.nextInt();

       for(int i=number; i>0; i--)
        factorial*=i;

        System.out.println(numberr + "!="+factorial);

        //P4:Display all natural numbers from 1 to 100 as 10 numbers per line by using for statement
        Scanner scann=new Scanner(System.in);

        for(int i=0; i<100; i+=10){

        for(int j=1; j<11; j++)
          System.out.print((i+j)+ "  ");
          System.out.println();
        }

        //P5:Display odd natural numbers from 1 to 99 as 5 numbers per line by using for statement
        Scanner scn=new Scanner(System.in);

        int num=scan.nextInt();

        for(int i=0; i<number; i+=10){
          for(int j=1; j<=10 && (i+j)<=number; j+=2)
            System.out.printf("%*5d", (i+j));
            System.out.println();

        //P6: Even numbers
        Scanner scnss=new Scanner(System.in);

        int num1=scan.nextInt();
        for(int i=0; i<number; i+=10){
          for(int j=2; j<=10 && (i+j)<=number; j+=2)
            System.out.printf("%*5d", (i+j));
            System.out.println();
        
        
        //P7: Display the base-2 system equivalent of a number entered by the user as base-10 system in reverse order
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a digit in base-10: ");

        int n =2*input.nextInt();

        while (n>1) {
      
            System.out.printf("%d", ((n/=2)% 2));
        }
        
        //P8: real order
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int counter=0, number=scan.nextInt(), temp=number;
        

        for(int i=number; i>=0; i/=2)
            counter++;
        for(int i=counter; i>=1; i--){
        for(int j=i; j>1; j--)
                temp/=2;
                System.out.print(temp%2);
                temp=number;
        }
        //HOMEWORK
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit in base-5: ");
        int n = input.nextInt();
        
        int power = 1; //5 üzeri 0 1 olduğu için
        int temp2 = 0;
        int base10 = 0;
        int counter = 0;
        int temp1 = 0;
        
        while (n > 0) {
            temp1 = n % 10;
            base10 += temp1 * power;
            n /= 10; 
            power *= 5;
        }
        
        temp2 = base10;

        for (int i = base10; i >= 1; i /= 9)
            counter++;
        
        for (int i = counter; i >= 1; i--) {
            
            for (int j = 1; j < i; j++)
                temp2 /= 9;
                
            System.out.print(temp2 % 9);
            temp2 = base10;
        }
        
        input.close();


        //P9: 10x10 tablo

        
         
        //P10: kombinasyon
        Scanner input=new Scanner(System.in);

        System.out.printf("Enter C(n,k) respecively:");
        int n=input.nextInt(), k=input.nextInt(), result=1;

        for(int i=n; i>(n-k); i--)
          result*=i;

        for(int i=k; i>1; i--)
          result/=i;
        System.out.printf("%d", result);




      

      }}}}
