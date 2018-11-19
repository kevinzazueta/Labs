
/**
 * Write a description of class video15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class k{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        video15 video15Object = new video15();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        video15Object.simpleMessage(name);

    }
}


public class video15 {
    public void simpleMessage(String name){
        System.out.println("Hello " + name);
    }
}
