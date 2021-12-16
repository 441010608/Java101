import java.util.Scanner;
public class SquareWidthAndHeight
{
	public static void squareWidthAndHeight(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		
		int var= scan.nextInt();
		 if (var==1){
		//If he chooses 2, the box will be printed
		System.out.println("Enter  height");
		//Ask the user to enter the length
		int var3 = scan.nextInt();
		System.out.println("Enter number offer");
		//Ask the user to enter the offer
		int var4 = scan.nextInt();
		System.out.println(var3 * var4);
	}
	
	}
	}
