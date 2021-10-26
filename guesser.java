package ooplab;

import java.util.Scanner;
public class guesser {

    public static void main(String[] args) {
        int number;
        int guess;
        int counter=0;
        number=(int) (Math.random() * 99 + 1);
        do{
        System.out.print("Guess the number: ");
        
        Scanner reader = new Scanner(System.in);
        guess = reader.nextInt();
        counter++;
        
        if(number==guess ){
            System.out.println("You are correct, the number is " + guess);
        }
        
        else if (number<guess){
            System.out.println("Number is lesser than " + guess);
    }
        else if(number>guess){
            System.out.println("Number is greater than " + guess);
        }
        } while (number != guess && counter <= 4);
    System.out.println("You guessed " + counter + " times");
    }
}
