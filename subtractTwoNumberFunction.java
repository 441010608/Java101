import java.util.Scanner;
public class SubtractTwoNumberFunction {
    public static void subtractTwoNumberFunction(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the number");
        float num = var.nextFloat();
        if(num <0)
        System.out.println("the Number negative");
        else 
          System.out.println("the Number Postive");
    }
}

