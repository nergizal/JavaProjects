import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.lang.model.util.ElementScanner6;
public class ders6 {
    //ödev:
    Scanner input = new Scanner(System.in);
        System.out.print("Enter a length: ");
        int length = input.nextInt();

        int[][] arrays = new int[length][length];
        int numbers = 1;
        int i, j, tour;

        for (tour = 0; tour <= length / 2; tour++) {
            for (i = tour, j = tour; j < length - tour; j++) {
                arrays[i][j] = numbers++;
            }
            j--;
            i++;
            for (; i < length - tour; i++) {
                arrays[i][j] = numbers++;
            }
            i--;
            j--;
            for (; j >= tour; j--) {
                arrays[i][j] = numbers++;
            }
            i--;
            j++;
            for (; i > tour; i--) {
                arrays[i][j] = numbers++;
            }
        }

        for (i = 0; i < length; i++) { //Spiralden farklı olan kısım
            for (j = 0; j < length; j++) {
                arrays[i][j] = (length * length) - arrays[i][j] + 1;
            }
        }

        for (i = 0; i < length; i++) {
            for (j = 0; j < length; j++) {
                System.out.printf("%5d", arrays[i][j]);
            }
            System.out.println();
        }
  



   //P1:Code the program that sorts and displays the elements of a one-dimensional array from lowest to from to the highest
   int array[ ]={2,4,9,7,6,1,13,8,-8,-5};
   int temp;
   

   for(int i=0; i<9; i++)
        for(int j=i+1; j<10; j++)
            if(array[i]>array[j]){
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
    for(int i=0; i<10; i++)
        System.out.printf("%d\n", array[i]);

        
    //P2: Code the program that finds and displays the difference between the highest value and the lowest value of an array
    int array2[]={2,4,9,7,6,1,13,8,-8,-5};
    int max=array[0] ,min=array[0];

    for(int i=1; i<10; i++) {
            if(max<array[i])
                max=array[i];
            else if(min>array[i])
                min=array[i];}
    System.out.printf("The difference is %d.", max-min);

    //P3: Code the program that creates two different array for the even numbers and the odd numbers of a one dimensional array
    int array[]={2,4,9,7,6,1,13,8,-8,-5};
    int even=0, odd=0, evencounter=0, oddcounter=0;
    for(int i=1; i<100; i++)
        if(array[i]%2==0)
            even++;
        else
            odd++;
    int evenarray[]=new int [even],oddarray[]=new int [odd];

    for(int i=1; i<10; i++)
        if(array[i]%2==0)
            evenarray[evencounter++]=array[i];
        else
            oddarray(oddcounter++)=array[i];
    
    System.out.printf("Array with even numbers:\n");
    for(int i=0; i<even; i++)
        System.out.printf("%d\n", evenarray[i]);
    System.out.printf("Array with odd numbers:\n");
    for(int i=0; i<odd; i++)
        System.out.printf("%d\n",oddarray[i]);

    //P4
    int[] array={1,13,13,2,13,54,2,9,2,13,13,-31};
        int mode=0;
        int fr=0;
        int index=0;

        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]==array[j])
                {
                    fr++;
                }
                if(fr>mode)
                {
                index=i;
                }
            }   
            fr=0;
        }
        System.out.print("Mode of this Array: "+array[index]);

        //P5
        int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66,  68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int sum =0;

        int toplam = 100*101/2;

        for(int i=0;i<array.length;i++){
            sum = sum +array[i];
        }

        System.out.println(toplam - sum);


            }
        //P6
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
    //p7
    int array[]={}
    int control;

    System.out.printf("Prime numbers of the array:\n");
    for(int i=0; i<50; i++){
        control=0;
        for(int j=2; j<=array[i]/2; j++)
        if(array[i]%j==0){
            control =1;
            break;}
            if(control==0)
            System.out.printf("%d\n", array[i]);

        }
    //P8


    


    







