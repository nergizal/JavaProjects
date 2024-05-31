package bilgiz;

import java.util.Scanner;

public class calculator {
    
        public void add(int i, int j) {
            int result = i + j;
            System.out.println(i + " + " + j + " = " + result);
        }
        public void subtract(int i, int j) {
            int result = i - j;
            System.out.println(i + " - " + j + " = " + result);
        }
        public void multiply(int i, int j) {
            int result = i * j;
            System.out.println(i + " * " + j + " = " + result);
        }
        public void divide(int i, int j) {
            if (j == 0) {
                System.out.println("You cannot divide a number by zero!");
            } else {
                int result = i / j;
                System.out.println(i + " / " + j + " = " + result);
            }
        }
        
        public void mod(int i, int j) {
            int result = i%j;
            System.out.println(i + " % " + j + " = " + result);
        }
        public static void main(String[] args) {
            calculator calculator = new calculator();

            Scanner scan = new  Scanner(System.in);
            System.out.println("Please enter two number:");
            int x = scan.nextInt();
            int y = scan.nextInt();

            calculator.add(x,y);
            calculator.subtract(x,y);
            calculator.multiply(x,y);
            calculator.divide(x,y);
            calculator.mod(x,y);  
        }
}