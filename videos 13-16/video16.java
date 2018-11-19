
/**
 * Write a description of class video16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class apples{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        video16 video16Object = new video16();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        video16Object.setName(temp);
        video16Object.saying();
    }
}


public class video16 {
    private String girlName;
    public void setName(String name){
        girlName=name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s", getName());
    }
}