import java.util.Scanner;
public class Q1
{
	public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Number");
	int var1 = scan.nextInt();
	var1= var1%2;
	if (var1==0)
	System.out.println("even");
	else
	System.out.println("odd");
	}
}
