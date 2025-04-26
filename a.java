// 1 Write a Java program to input your full name and print a greeting message.

// import java.util.Scanner;
// public class a {
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter your name");
//         String fullName=sc.nextLine();
//         System.out.println("Hello, " + fullName + "! Welcome to the Java program.");
//     }
// }


// 2 Take two numbers as input and print their sum, difference, product, and quotient.
// import java.util.Scanner;
// public class a{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the first number:");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter the second number:");
//         double num2 = sc.nextDouble();

//         double sum = num1+ num2;
//         double diff = num1-num2;
//         double product = num1*num2;
//         double quotient = num1/num2;

//         System.out.println("The sum is " + sum);
//         System.out.println("The diff is"+ diff);
//         System.out.println("The product is"+ product);
//         System.out.println("The quotient is"+quotient);



//     }
// }


// 3
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         double num = sc.nextDouble();

//         if (num > 0) {
//             System.out.println("The number is positive.");
//         } else if (num < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
// }



//4
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 5 == 0 && num % 11 == 0) {
//             System.out.println("The number is divisible by both 5 and 11.");
//         } else {
//             System.out.println("The number is not divisible by both 5 and 11.");
//         }
//     }
// }



// 5
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int num3 = sc.nextInt();

//         int largest = num1;

//         if (num2 > largest) {
//             largest = num2;
//         }

//         if (num3 > largest) {
//             largest = num3;
//         }

//         System.out.println("The largest number is: " + largest);
//     }
// }



//6
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0) {
//             System.out.println("The number is even.");
//         } else {
//             System.out.println("The number is odd.");
//         }
//     }
// }



//7
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("You are eligible to vote.");
//         } else {
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }




//8
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);

//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
//             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//             System.out.println("The character is a vowel.");
//         } else {
//             System.out.println("The character is a consonant.");
//         }
//     }
// }


//9
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks for subject 1: ");
//         double sub1 = sc.nextDouble();
//         System.out.print("Enter marks for subject 2: ");
//         double sub2 = sc.nextDouble();
//         System.out.print("Enter marks for subject 3: ");
//         double sub3 = sc.nextDouble();
//         System.out.print("Enter marks for subject 4: ");
//         double sub4 = sc.nextDouble();
//         System.out.print("Enter marks for subject 5: ");
//         double sub5 = sc.nextDouble();

//         double total = sub1 + sub2 + sub3 + sub4 + sub5;
//         double percentage = (total / 500) * 100;

//         char grade;

//         if (percentage >= 90) {
//             grade = 'A';
//         } else if (percentage >= 80) {
//             grade = 'B';
//         } else if (percentage >= 70) {
//             grade = 'C';
//         } else if (percentage >= 60) {
//             grade = 'D';
//         } else {
//             grade = 'F';
//         }

//         System.out.println("Total Marks: " + total);
//         System.out.println("Percentage: " + percentage + "%");
//         System.out.println("Grade: " + grade);
//     }
// }



//10
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println(year + " is a leap year.");
//         } else {
//             System.out.println(year + " is not a leap year.");
//         }
//     }
// }


// 11
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         boolean isPrime = true;

//         for (int i = 2; i <= num / 2; i++) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         if (isPrime && num > 1) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }



// 12
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         System.out.println("Multiplication table of " + num + ":");
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }
//     }
// }



// 13
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
//     }
// }



// 14
// public class a {
//     public static void main(String[] args) {
//         System.out.println("Even numbers from 1 to 100:");
//         for (int i = 2; i <= 100; i += 2) {
//             System.out.println(i);
//         }
//     }
// }



// 15
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int factorial = 1;
//         for (int i = 1; i <= num; i++) {
//             factorial *= i;
//         }

//         System.out.println("The factorial of " + num + " is: " + factorial);
//     }
// }


// 16
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();
//         System.out.print("Enter operator (+, -, *, /): ");
//         char operator = sc.next().charAt(0);

//         double result;

//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Cannot divide by zero");
//                     return;
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//                 return;
//         }

//         System.out.println("The result is: " + result);
//     }
// }



// 17
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number (1-7): ");
//         int day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");
//                 break;
//             default:
//                 System.out.println("Invalid day number");
//         }
//     }
// }



// 18
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a month number (1-12): ");
//         int month = sc.nextInt();

//         int days;

//         switch (month) {
//             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                 days = 31;
//                 break;
//             case 4: case 6: case 9: case 11:
//                 days = 30;
//                 break;
//             case 2:
//                 days = 28; // Not considering leap year for simplicity
//                 break;
//             default:
//                 System.out.println("Invalid month number");
//                 return;
//         }

//         System.out.println("The month has " + days + " days.");
//     }
// }






// 19
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);

//         switch (ch) {
//             case 'a': case 'e': case 'i': case 'o': case 'u':
//             case 'A': case 'E': case 'I': case 'O': case 'U':
//                 System.out.println("The character is a vowel.");
//                 break;
//             default:
//                 System.out.println("The character is not a vowel.");
//         }
//     }
// }






// 20
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sqrt = (int) Math.sqrt(num);

//         if (sqrt * sqrt == num) {
//             System.out.println(num + " is a perfect square.");
//         } else {
//             System.out.println(num + " is not a perfect square.");
//         }
//     }
// }







// // 21
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int sum = 0;

//         while (num != 0) {
//             sum += num % 10;
//             num /= 10;
//         }

//         System.out.println("The sum of digits is: " + sum);
//     }
// }





// 22
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int reversed = 0;

//         while (num != 0) {
//             reversed = reversed * 10 + num % 10;
//             num /= 10;
//         }

//         System.out.println("The reversed number is: " + reversed);
//     }
// }




// 23
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int originalNum = num;
//         int reversed = 0;

//         while (num != 0) {
//             reversed = reversed * 10 + num % 10;
//             num /= 10;
//         }

//         if (originalNum == reversed) {
//             System.out.println(originalNum + " is a palindrome.");
//         } else {
//             System.out.println(originalNum + " is not a palindrome.");
//         }
//     }
// }






// 24
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int firstTerm = 0, secondTerm = 1;

//         System.out.println("Fibonacci Series:");

//         for (int i = 1; i <= n; ++i) {
//             System.out.print(firstTerm + ", ");
//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }
//     }
// }











// // 25
// import java.util.Scanner;

// public class a {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int count = 0;

//         while (num != 0) {
//             num /= 10;
//             count++;
//         }

//         System.out.println("The number has " + count + " digits.");
//     }
// }










