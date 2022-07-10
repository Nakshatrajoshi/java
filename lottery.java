import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        
        int lottery = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your lottery number ( two digits number )");
        int guess = input .nextInt();

        int lotteryDigit1 = lottery/10 ;
        int lotteryDigit2 = lottery%10 ;

        int guessDigits1 = guess/10;
        int guessDigits2 = guess %10;

        System.out.println(" the lottery number is "+ lottery );

        if (guess == lottery )
        {System.out.println("Exact match : you win RS 10,0000");}
        else if (guessDigits1 == lotteryDigit2 && guessDigits2 == lotteryDigit1)
        {
            System.out.println(" Match all digits : you win Rs 30,000");
        }
        else if (guessDigits1 == lotteryDigit1 || guessDigits2 ==  lotteryDigit2 || guessDigits1 == lotteryDigit2 || guessDigits2 ==lotteryDigit1)
        {
            System.out.println(" Match on digits : you win Rs 10,000");
        }
        else {
            System.out.println(" sorry , no match ");
        }
    }
}
