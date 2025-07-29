package LAB;
import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		ch = sc.next().charAt(0);
		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
		{
			System.out.println("It's an alphabet!");
		}
		else
		{
			System.out.println("It's not an alphabet");
		}

	}

}
