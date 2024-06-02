// import java.util.Scanner;

// public class SherinHomework {
    
//     public static boolean isPrime(int number) {
//         if (number <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= number/2; i++) {
//             if (number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static boolean isPerfect(int number) {
//         int sum = 0;
//         for (int i = 1; i <= number/2; i++) {
//             if (number % i == 0) {
//                 sum += i;
//             }
//         }
//         return sum == number;
//     }

//     public static void primes(int firstNumber, int secondNumber) {
//         System.out.print("\n\nPrime numbers between " + firstNumber + " and " + secondNumber + " are: [");
//         for (int i = firstNumber; i <= secondNumber; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + ", ");
//             }
//         }
//         System.out.print("\b\b]\n\n");
//     }

//     public static void perfects(int firstNumber, int secondNumber) {
//         int perfectCount = 0;
//         for (int i = firstNumber; i <= secondNumber; i++) {
//             if (isPerfect(i)) {
//                 perfectCount++;
//             }
//         }
//         System.out.print("The number of perfect numbers between " + firstNumber + " and " + secondNumber + " is: " + perfectCount + "\n\n");
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("|This program will find then print prime and perfect numbers between two numbers.|\n");
//         System.out.print("Please enter the first number: ");
//         int firstNumber = in.nextInt();
//         System.out.print("\nPlease enter the second number: ");
//         int secondNumber = in.nextInt();
//         in.close();
//         primes(firstNumber, secondNumber);
//         perfects(firstNumber, secondNumber);
//     }
// }