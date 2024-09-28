package gitHubTestig;
import java.util.Scanner;

public class FirstJavaProgram{

public static void main(String [] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("WHat is your name?");
    String input = scan.next();

    System.out.println("Hello " + input);

    //I want to use the code bellow to get the person response and get key
    //words to find out if the are doing well or bad
    
    //input = scan.nextLine();
    //String[] response = input.split("[//s]+");
    //System.out.println("Your respone is: " + response.toString()); 
}

}