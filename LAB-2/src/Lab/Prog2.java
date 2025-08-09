package Lab;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("equals(): The strings have the SAME content.");
        } else {
            System.out.println("equals(): The strings have DIFFERENT content.");
        }


        if (str1 == str2) {
            System.out.println("== : Both refer to the SAME memory location.");
        } else {
            System.out.println("== : They refer to DIFFERENT memory locations.");
        }

        sc.close();
    }
}
