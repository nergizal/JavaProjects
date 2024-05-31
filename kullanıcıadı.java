import java.util.Scanner;


public class kullanıcıadı{
    
        public static void main(String[] args) {
          Scanner get= new Scanner(System.in);
            System.out.println("Please create your username: ");
            String username= get.nextLine();
            
            System.out.println("Please create a parola: ");
            String parola= get.nextLine();
            
            String yourusername;
            String yourparola;
            
            do {
            Scanner take= new Scanner (System.in);
            System.out.println("Please enter your username: ");
            yourusername = take.nextLine();
            
            System.out.println("Please enter your parola: ");
            yourparola = take.nextLine();
            
            if(!yourusername.equals(username)) System.out.println("You enter wrong username.");
            if(!yourparola.equals(parola)) System.out.println("You enter wrong parola");

            } while(!(yourusername.equals(username)) && !(yourparola.equals(parola)));

            System.out.println("You enter your account.");
      }
    }
    

