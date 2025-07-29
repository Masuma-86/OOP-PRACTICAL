package LAB;
import java.util.Scanner;
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter character: ");
		ch = obj.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("VOWEL");
		}
		else
		{
			System.out.println("CONSONANT");
		}
	}
}
