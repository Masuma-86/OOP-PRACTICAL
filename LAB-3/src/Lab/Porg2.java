package Lab;
import java.util.Scanner;
public class Porg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(name.charAt(i));
		}
	}
}
