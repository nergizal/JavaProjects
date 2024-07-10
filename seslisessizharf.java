package GecmisVizeFinal;

import java.util.Scanner;
//Complate the code if entered character is vowel or consonant
public class vowelfalan {
    public static void main(String[] args) {
        Scanner onur = new Scanner(System.in);
        char c;
        do
        {
            System.out.println("Enter a character:");       
            c=onur.nextLine().charAt(0);

        }while (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')));
    
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Vowel"); break;
            default: System.out.println("Consonant");
        }
    }
}
