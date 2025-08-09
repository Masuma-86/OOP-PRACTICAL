package Lab;
import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str1 = sc.nextLine();
		int count=0;
		for(int i=0; i<str1.length(); i++)
		{
			char temp = str1.charAt(i);
			if(temp == 'a' || temp == 'i' || temp == 'e' ||temp == 'o' || temp == 'u' || temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U')
			{
				count++;
			}

		}
		System.out.println("Number of vowels : " +count);
	}
}
