public class Main {
    public static void main(String[] args) {

        char [][] crossword = {
                {' ','l',' ','0','c',' ',' ','0',' ',' ','a'},
                {' ',' ',' ','m',' ',' ','0','a',' ',' ',' '}};

        String [] solutions = {"mahmut","ayse","can","ali","oya"};
        int[][] sira = new int[solutions.length][2];

        System.out.printf("%-10s%-10s%-10s\n\n","Output:","Row","Column");

        for(int i = 0; i < crossword.length; i++){
            int control = 0;
            int temp = 0;
            for(int j = 0; j < crossword[i].length; j++){
                if (crossword[i][j] != ' ' && crossword[i][j] != '0'){
                    control = j;
                }
                if(crossword[i][j] == '0' || (j + 1) == crossword[i].length){
                    if((j + 1) == crossword[i].length)
                        j++;
                    for(int k = 0; k < solutions.length; k++){
                        if (solutions[k].length() == j - temp && solutions[k].charAt(control - temp) == crossword[i][control]){
                            sira[k][0] = i + 1;
                            sira[k][1] = temp + 1;
                        }
                    }
                    temp = j + 1;
                }
            }
        }

        for(int i = 0; i < sira.length; i++){
            System.out.printf("\n%-10s",solutions[i]);
            for(int j = 0; j < 2; j++){
                System.out.printf("%-10d",sira[i][j]);
            }
        }
    }
}