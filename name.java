package ooplab;

import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        
    Scanner reader = new Scanner(System.in);
    System.out.print("Type your name: ");
    
    String name = (reader.nextLine());
    String reverse_name = "";
    for( int i = name.length(); i > 0; i--){
    reverse_name += name.charAt(i - 1);
    } 
        System.out.println("Your name is " + name + "\nReverse of your name is " + reverse_name);
        }
    
    }