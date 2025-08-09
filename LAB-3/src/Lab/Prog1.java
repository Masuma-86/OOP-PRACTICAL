package Lab;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = sc.nextLine();
		StringBuilder sb = new StringBuilder(str1);
		System.out.println("Reverse string: " +sb.reverse());
		String str2 = sb.toString();
		if(str1.equals(str2))
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not a Palindrome!");
		}
	}
}
