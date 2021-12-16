import java.util.Scanner;
public class PositiveAndNegative {
    public static void positiveAndNegative(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the number");
        float num = var.nextFloat();
        if(num <0)
        System.out.println("the Number negative");
        else 
          System.out.println("the Number Postive");
    }
}
