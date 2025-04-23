// Write a Java program to input your full name and print a greeting message.

import java.util.Scanner;
public class a {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name");
        String fullName=sc.nextLine();
        System.out.println("Hello, " + fullName + "! Welcome to the Java program.");
    }
}
