import java.util.Scanner;
public class Even_switch
{
	public static void even_switch(String[] args) {
	Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Number 1");
	     int var = scan.nextInt();
		switch (var){
		    case 1 :
		        
		 int var2;       
		 System.out.println("Enter Number");
		  var2 = scan.nextInt();
		 var2 = var2 % 2;
		if(var2==0)
		System.out.println("even");
        else 
		System.out.println("odd");
		
		        
		}
	}
}

