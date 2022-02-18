public class practice3 {
   
    static int sum(int ...arr) {
      int result = 0;
      for(int a: arr){
          result += a;

      }      
     return result ;
    }
  public static void main(String[] args) {
      System.out.println("the sum of these numbers are "+sum(4,5,6,7));
  }  
}
