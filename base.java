import java.util.Scanner;

public class base {
	public static void main(String[] args) {
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
	}
}
