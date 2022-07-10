import java.util.Scanner;

/**
 * printalpha
 */
public class printalpha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds ");
        double weight = input.nextDouble();

        
        System.out.println("Enter height in  inch");
        double height = input.nextDouble();

          final double KG_per_pound = 0.45359237;
          final double Meter_per_inch = 0.0245;

          double weightinkg = weight * KG_per_pound;
          double heightinnmeter = height * Meter_per_inch;

          double bmi = weightinkg/(heightinnmeter * heightinnmeter);

          System.out.println("BMI is "+ bmi );
          if (bmi < 18.5) {
            System.out.println("underweight ");
          }
          else if(bmi < 25){
            System.out.println("normal");
          }
          else if (bmi < 30 ){
            System.out.println("overweight");

          }
          else{
            System.out.println(" obese");
          }


    }
}