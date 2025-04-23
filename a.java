// multiplication tbale of a given number
import java.util.Scanner;

public class a{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number for table:");
        int num = sc.nextInt();
        int i=1;
        
        
        do{
            System.out.println(num + "*" + i + "=" + (num*i));
            i++;
            
        }while(i<=10);
        }
        
    }