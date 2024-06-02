// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// public class MahmoudQ {
//     public static void main(String[] args) {
//         int n, temp = 0;
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter Array Size: ");
//         n = in.nextInt();
//         in.close();
//         ArrayList<Integer> arrt = new ArrayList<>(n);
//         for (int i = 0; i < n; i++) {
//             arrt.add(i+1);
//         }
//         Collections.sort(arrt);
//         arrt.remove(7);
//         for (int i : arrt) {
//             System.out.print(i + " ");
//         }
//         for (int i = 0; i < n-1; i++) {
//             if (arrt.get(i) != i+1) {
//                 temp = i+1;
//                 break;
//             }
//         }
//         System.out.println("\nThe Unavailable Number Is: " + temp);
//     }
// }