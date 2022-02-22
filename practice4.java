public class practice4 {
    
    public static void main(String[] args) {
        int n = 10 ;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        for (int k = 1; k <=i-j; k++) {
                        System.out.print(" * ");     
                        }                   
                    }
                    System.out. println();
                }    
    }
}
