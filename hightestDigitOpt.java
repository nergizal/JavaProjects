public class hightestDigitOpt {
    public static void main(String[] args) {
        int array[] = { -32, -5, -621, -500, -321, -1000, 100, 50};

        int nofdigits = 1;
        int max = array[0], min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) max = array[i];
            else if (min > array[i]) min = array[i];
        }

        if (-1*min>max) max = (-1*min);

        while ((max/=10) > 0) nofdigits++;

        System.out.println(nofdigits);
    }
}
