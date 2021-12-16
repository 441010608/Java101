import java.util.Scanner;
public class Largest {
    public static void largest(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter Number 1 : " );
        num1 = scan.nextInt();
        System.out.println("Enter Number 2 : " );
        num2 = scan.nextInt();
        System.out.println("Enter Number 3 : " );
        num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("The Largest Number is" + num1);
        
        }else if (num2 > num1 && num2 > num3){
            System.out.println("The Largest Number is" + num2);
        
        }else if (num3 > num1 && num3 > num2) {
            System.out.println("The Largest Number is" + num3);
        }else{
             System.out.println("The numbers are even" );
        
        }
    }

}

