package Uygulamalar;
//Find the mode of an array
//-'lerde hala sikinti var!
public class mod {
    public static void main(String[] args) {
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
        
    }
    
}
