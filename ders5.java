
import java.util.Scanner;


public class ders5 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception {
    //one dimensional arrays  
    //P1
    int [] array1= new int[20];
    for(int i=0; i<20; i++){
        array1[i]=i+1;
        System.out.println(array1[i]);}
    //P1.2
    int [] arrayy= new int [20];
    for(int i=1; i<=20; i++){
        arrayy[i-1]=i;
    }

 
    //P2 homework
    int arrays []= new int[20];
    for(int i=0; i<20; i++)
        arrays[i]=2*(i+1);

    //P3 homework
    int array3 []=new int[20];
    for(int i=0; i<20; i++)
        array3[i]=2*i+1;

    //P4 
        Scanner input = new Scanner(System.in);

        int array [] = new int[10];
        int sum= 0;

        for(int i = 0; i<10; i++) {
            System.out.println("Please enter the "+(i+1)+". number: ");
            array[i] = input.nextInt();
            sum+=array[i];
        }
        System.out.println("Avarage is "+sum/10+"");

    //P5
        int[] array5 = {1,-2,-3,4,5,-6,7,8,9,1};// we have no condition for zero
        for(int i=0; i<array5.length; i++)
            if(array5[i]<0)
            System.out.println(array5[i]);
        for(int i=0; i<array5.length; i++)
            if(array5[i]>0)
                System.out.println(array5[i]);


    //P6
        int[] array6= {   };
        int length=array6.length;
        int reverseofarray []=new int [length];

            for(int i=0; i<length; i++)
            reverseofarray[i]=array6[length-i-1];

    //P7
        Scanner get= new Scanner(System.in);
        int[] array7={0,1,-2,-3,4,5,-6};
        int h=array7[0];

        for(int i=1; i<array6.length; i++)
        if(array7[i]>h)
            h=array6[i];

            System.out.println(h);
        
    //P8-homework

    //P9
        int array9 []={};
        int length9 =array9.length;
        int nofevens=0;

        for(int i=0; i<length; i++)
            if(array9[i]%2==0)
            nofevens++;
        System.out.printf("There are %d even numbers\n.", nofevens);
        System.out.printf("There are %d odd numbers.\n", length-nofevens);
    //P10
    int [] array11={0,1,-2,-3,4,5,-6,7,8,9,-11,12,-13,14,-15,16};
    int array222 []={11,12,13,4,15,7,10,0,-2,25,26,23,24};

    for(int i=0; i<array11.length; i++)
    for(int j=0; j<array222.length; j++)
            if(array11[i]==array222[j])
            System.out.println(array11[i]+ "\t" + (j+1));
    //two dimensional arrays
        //P1
        int [][] array =new int [20][20];
        for(int i=0; i<10; i++)
            for(int j=0; j<20; j++)
                array[i][j]=20*i + j+1;
                int i,j;
                System.out.printf("%4d",array[i][j]);
            System.out.println( );}
        //P2-P3-P4+homework
        //P5
        int array1[][]=new int [10][10],array2[][]=new int [10][10],array3[][]=new int [10][10];
        for(int i=0; i<10;i++)
            for(int j=0; j<10; j++){
                array1[i][j]=i+1;
                array2[i][j]=j+1;
                array3[i][j]=(i+1)*(j+1);
            }
        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++)
            System.out.printf("%d\t",array1[i][j]);
        System.out.printf("\n");}

        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++)
            System.out.printf("%d\t",array2[i][j]);
        System.out.printf("\n");}

        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++)
            System.out.printf("%d\t",array3[i][j]);
        System.out.printf("\n");}

        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++)
            System.out.printf("%2dx%2d=%3d");
        System.out.printf("\n");}


        //P7
        int integerarray[][]={ };
        boolean booleanarray[][]= new boolean [10][10];

        for(int i=0; i<10; i++)
            for(int j=0; j<10;j++)
                if(integerarray[i][j]%2==0)
                booleanarray[i][j]=true;
                else 
                booeleanarray[i][j]=false;
        //P8-homework
        //P9
        char ch [][] ={   };
        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++)
                if(ch[i][j]>='A' && ch[i][j]<='Z')
                ch[i][j]-=('A'-'a');
            else if(ch[i][j]>='a' && ch[i][j]<='z')
                ch[i][j]+=('A'-'a');
        
        for(int i=0; i<ch[][].length; i++){
            System.out.print(ch[i]+" ");
        }

        //P10
        Scanner input= new Scanner(System.in);
        int length, numbers=1,i,j,tour;
        System.out.printf("Please enter the length of the matrix:");
        length=input.nextInt();
        int spiral[][]=new int [length][length];

        for(tour=0; tour<=length/2; tour++){
            for(j=tour, i=tour; j<length-tour; j++)
            spiral[i][j]=numbers++;
            j--; i++;

            for( ; i<length-tour; i++)
            spiral[i][j]=numbers++;
            i--; j--;

            for(  ; j>=0+tour; j--)
            spiral[i][j]=numbers++;

            j++; i--;
            for( ; i>0+tour; i--)
            spiral[i][j]=numbers++;}

            for(i=0; i<length; i++)
                for(j=0; j<length; j++)
                System.out.printf("%d\t", spiral[i][j]);
                System.out.printf("\n");


        


        



       




            
        
        

        }
