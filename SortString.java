import java.util.Scanner;

public class SortString {

    public static String sort_string(String str) {
        char[] strArr = new char[str.length()];
        if(!str.isEmpty()) {
            for(int i = 0; i < str.length(); i++) {
                strArr[i] = str.charAt(i);
            }
            for(int i = 0; i < str.length(); i++) {
                for(int j = 0; j < str.length(); j++) {
                    if(strArr[i] < strArr[j]) {
                        char temp = strArr[i];
                        strArr[i] = strArr[j];
                        strArr[j] = temp;
                    }
                }
            }
            return new String(strArr);
        }
        else {
            return "Please enter";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        in.close();

        String sortedString = sort_string(input);
        System.out.println("Sorted string: " + sortedString);
    }
}
