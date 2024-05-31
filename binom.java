import java.util.Scanner;
public class binom {

    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.printf("Enter C(n,k) respecively:");
        int n=input.nextInt(), k=input.nextInt(), result=1;

        for(int i=n; i>(n-k); i--)
          result*=i;

        for(int i=k; i>1; i--)
          result/=i;
        System.out.printf("%d", result);


}}
