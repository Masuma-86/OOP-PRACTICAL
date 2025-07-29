package LAB;
import java.util.Scanner;
public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		double sol;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number : ");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
			sol = Math.sqrt(i);
			System.out.println("Square root of "+i + " : " +sol);
		}
		
	}

}
