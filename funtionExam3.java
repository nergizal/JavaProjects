package Function;
import java.util.Scanner;

public class funtionExam3 {
    static String Scan()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String Value");
        return scan.nextLine();
    }
    static String Convert(String eren) // komple stringi büyüğe veya küçüğe çevirme
    {
        for(int i=0; i<eren.length(); i++)
        {
            char ch = eren.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(eren.toLowerCase().charAt(i));
            }
            else if(Character.isLowerCase(ch))
            {
                System.out.print(eren.toUpperCase().charAt(i));
            }
            else if (ch == ' ') 
            {
                System.out.print(ch);
            }
        }
        return eren;
    }
    public static void main(String[] args) {
        String onur = Scan();
        Convert(onur);
    }
}
