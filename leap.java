import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter a year ");
        int year = input.nextInt();

        boolean isleapyear = (year % 4 == 0 && year % 100 !=0 )|| (year % 400 == 0);

        System.out.println(year + " ia a leap year? "+ isleapyear);

    }
}
