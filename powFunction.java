import java.util.Scanner;
public class PowFunction  {
    static int add(int num) {
        return num*num;
    }


    public static void powFunction(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num= scan.nextInt();


        System.out.println(add(num));

    }
}
