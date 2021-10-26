package ooplab;
import java.util.Scanner;
public class sum {

public static void main(String[] args) {

int a;
int b;
int sum;
System.out.print("Enter first number: ");
Scanner reader = new Scanner(System.in);
a = reader.nextInt();

System.out.print("Enter second number: ");
b = reader.nextInt();
sum=a+b;
System.out.println("Sum = " +sum);

}
}
