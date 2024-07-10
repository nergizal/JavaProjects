package Function;
import java.util.Scanner;

//(1)Code the program that calculates the sum of Natural Numbers until “n” by using a function
//(2)Code a function to create your own integer scanner
//(3)Code the program that ranks an array from lowest to the highest by using a function.
//(4)Code the program that converts user-entered lowercase characters to uppercase characters or uppercase characters to lowercase characters by using a function.
public class functionExam1 {
    public static int Sum(int n) // Sum until n Function
    {
        return n*(n+1)/2;
    }
    static int Scan() // Scan Function
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        return scan.nextInt();
    }
    static int[] Rank(int[] n) // Ranks an array from lowest to the highest Function
    {
        int temp;
        for(int i=0; i<n.length; i++)
        {
            for(int j=i+1; j<n.length; j++)
            {
                if(n[i]>n[j])
                {
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        return n;
    }
    static char Convert(char onur) // büyüğü küçüğe, küçüğü büyüye dönüştürme
    {
        if(onur >= 'A' && onur <= 'Z')
        {
            return Character.toLowerCase(onur);
        }
        else if(onur >= 'a' && onur <= 'z')
        {
            return Character.toUpperCase(onur);
        }
        return onur;   
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a char");
        char emir = scan.next().charAt(0);
        char result = Convert(emir);
        System.out.println(result);
    }
}
