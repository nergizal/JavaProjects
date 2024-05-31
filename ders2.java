import java.util.Scanner;
public class ders2 {
    public static void main(String[] args) throws Exception {

        //DERS2
     /*Practice 1 Display all natural numbers from 1 to 100 each on different lines by using for statement
       for(int i=1; i<=100; i++)
       System.out.print(i + "\n");
     
    // Practice 2 Display sum of natural numbers until n entered by the user.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int sum=0, number = scan.nextInt();
        
        for(int i=1; i<=number; i++)
        sum+=i;
        System.out.println("The result is "+sum+".");

    
    // Practice 2 Başka Çözüm
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number");
    int sum=0, nu mber=scan.nextInt();

    for(int i=number; i>0; i--)
    sum+=i;
     System.out.println("The result is "+sum+".");
    

     //Practice 3: Display factorial value of n entered by the user
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int factorial =1, number= scan.nextInt();

    for(int i=number; i>0; i--)
        factorial*=i;
    System.out.println(number+"!=" +factorial);
    
    // Practice 3 başka çözüm 1 ile çarpmaya gerek yok gibi olan çözüm
    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter a number");
    int factorial=1, number= scan.nextInt();

    for(int i=2; i<=number; i++)
    factorial*=i;
    System.out.println(number + "!="+ factorial);
    
    //Practice 4:Display all natural numbers from 1 to 100 as 10 numbers per line by using for statement
    Scanner scan = new Scanner(System.in);
    
    for(int i=0; i<100; i+=10){
        for(int j=1; j<11; j++)
        System.out.print((i+j)+ "  ");
        System.out.println();
    }
    
    //Practice 4 Başka çözüm 
    Scanner scan = new Scanner(System.in);
    
    for(int i=0; i<100; i+=10){
        for(int j=1; j<11; j++)
        System.out.printf("%-5d", (i+j));
        System.out.println();
    }
    
    // Practice 5:Display odd natural numbers from 1 to 99 as 5 numbers per line by using for statement
    Scanner scan = new Scanner(System.in);
    int number=scan.nextInt();

    for(int i=0; i<number; i+=10){
        for(int j=1;j<=10 && (i+j)<=number; j+=2)
        System.out.printf("%-5d", (i+j));
        System.out.println();

    }
    
    
    //Practice 9 çarpım tablosu
    

    //Practice 10

   Scanner input=new Scanner(System.in);
   System.out.printf("Enter C(n,k) respectively:");
   int n=input.nextInt(), k=input.nextInt(), result=1, i=n, j=k;

        while(i>(n-k))
            result*=i--;
        while(j>1)
            result/=j--;
   System.out.printf("%d", result);

*/


    
    
    

    
}}