// import java.util.Scanner;

// class Assignment {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         System.out.print("Enter min num of the interval: ");
//         int min = input.nextInt(); 
        
//         System.out.print("\nEnter max num of the interval: ");
//         int max = input.nextInt(); 
        
//         PrimeNumbers(min, max);
//         System.out.println("]");
        
//         int perfectCount = countPerfectNumbers(min, max);
//         System.out.println("Number of perfect numbers between " + min + " and " + max + " is: " + perfectCount);
//     }

//     public static void PrimeNumbers(int min, int max) {
//         System.out.print("Prime numbers between " + min + " and " + max + " are:");
//         System.out.print("[");

//         for (int i = min; i <= max; i++) {
//             if (i == 1 || i == 0)
//                 continue;

//             boolean isPrime = true;

//             for (int j = 2; j <= i / 2; ++j) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }

//             if (isPrime)
//                 System.out.print(i + ", ");
//         }
//     }

//     public static int countPerfectNumbers(int min, int max) {
//         int count = 0;
        
//         for (int i = min; i <= max; i++) {
//             int sum = 0;

//             for (int j = 1; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     sum += j;
//                 }
//             }

//             if (sum == i && i != 0) {
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }
