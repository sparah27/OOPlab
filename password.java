package ooplab;
import java.util.Scanner;

public class password {
    
  
    
 public static void main(String[] args) {
        
    String password= "ibu";
        

        // The secret is BURCH

    Scanner in = new Scanner(System.in);
    while (true)
    { 
        System.out.print("Enter passowrd : "); 
        String userpassword= in.nextLine();
        if(userpassword.equals(password)){
            System.out.print("Correct password");
            }

        }

        System.out.print("Enter passowrd : "); 

    }

}
    
}
