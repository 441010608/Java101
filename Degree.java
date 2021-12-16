import java.util.Scanner;
public class Degree
{
	public static void degree(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number froom 0 to 100");
	    float var = scan.nextFloat();
	    if (var>=90){
	        System.out.println(""+var+"is equivalent to A ");
	    }else if (var>= 80){
	        System.out.println("Good job with a"+var+"out of 100 ");
	    }else if (var>= 60){
	        System.out.println("passed the course with"+var+"out of 100 ");
	    }else 
	    System.out.println("sorry you fail or you entered a wrong grade");
	    

	}
}
