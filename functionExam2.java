package Function;
//(1)Code a void function to print a 2D array as a matrix form
//(2)Code a class and functions under the class to calculate the perimeter and area of geometric shapes. (Triangle, Square, Hexagon, Trapezoid, etc.)
//(3)Code a void function that displays if a number is a prime number or not.
//(4)Code a void function that prints the odd numbers of an array from highest to the lowest.
//(5)Code a recursive function to find and print the Nth number of the Fibonacci sequence
public class functionExam2 {
    static class Onur
    {
        static int TrianglePerimeter(int a,int b,int c)
        {
            return a+b+c;
        }
        static int SquarePerimeter(int n)
        {
            return 4*n;
        }
        static int DiktörgnePerimeter(int n,int onur)
        {
            return (2*n)+(2*onur);
        }
        static int TrapezoidPerimeter(int a,int b,int c,int d)
        {
            return a+b+c+d;
        }
        static int TriangleArea(int a,int h)
        {
            return a*h/2;
        }
        static int SquareArea(int n)
        {
            return n*n;
        }
        static double HexagonArea(double n)
        {
            double sqrt3 = 1.732;
            return (3 * sqrt3 / 2) * n * n;
        }
        static int TrapezoidArea(int a,int b,int h)
        {
            return (a+b)*h;
        }
    }
    static void Convert(int[][] n) //2D matrix olarak yazdırma
    {
        for(int i=0; i<n.length; i++)
        {
            for(int j=0; j<n[i].length; j++)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void IsPrime(int n) // Prime buldurma
    {
        Boolean control = true;
        for(int i=2; i<n/2; i++)
        {
            if(n%i==0)
            {
                control = false;
                break;
            }
        }
        if(n == 1)
        {
            control = false;
        }
        else if(n == 0)
        {
            control = false;
        }
        System.out.println(control);
    }
    static int F(int n)//Fibonaçi
    {
        if (n <= 1)
        {
            return n;
        }
        return F(n-1) + F(n-2);
    }
    public static void main(String[] args) {
        int[][] onur ={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Convert(onur);

        IsPrime(91);
    }
}


