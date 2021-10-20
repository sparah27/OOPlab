package ooplab;
import java.util.Scanner;

public class year {
    public static void main(String[] args) {
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter how many years: ");
    
    int year = Integer.parseInt(reader.nextLine());
    if(year>0) {
    int seconds = year*365*24*60*60;
    System.out.println("There are " + seconds + " in " + year + " years.");
    }
    else{
        System.out.println("You entered 0");
    }
    
    
    
    }   
}
