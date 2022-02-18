public class practice {
    public static void main(String[] args) {
        int [] [] marks ;
        marks = new int [2] [3];
        marks[0][0] = 100 ;
        marks[0][1] = 90 ;
        marks[0][2] = 80 ;
        marks[1][0] = 90;
        marks[1][1] = 70 ;
        marks[1][2] = 60 ;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]);
                System.out.println("");
            }
            System.out.println("");
            
        }
    }
}
