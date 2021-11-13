import java.util.Random;
import java.util.Scanner;

//your grade is 5/5
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
         //get the input from the scanner as string. [ User Input w3schools ]
          String xyz = scan.nextLine();
          xyz = xyz.toLowerCase();
          char spr = xyz.charAt(0);

           
           
          

           if ( spr != 'r'&& spr != 'p' && spr != 's')
           break;
           
                

            //here is the computer choice
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
           
            if (spr == computerChoice )
                System.out.println("Draw");
                
                
                else if((spr =='p'&&computerChoice=='r')
                || (spr =='s'&&computerChoice=='p')
                ||(spr =='r'&& computerChoice=='s') )
                System.out.println("user win user="+spr+" computer="+computerChoice);
                
            else 
                System.out.println ("computer win ");
                System.out.println("user win user="+spr+" computer="+computerChoice);
            


            //print new line
            System.out.println("\n\n");
        }while(true);
    }
}
