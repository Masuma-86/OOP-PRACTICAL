package LAB;
import java.util.Scanner;
public class Prog4 {
	public static void main(String[] args)
	{
		int num, sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int i;
		for(i=1; i<num; i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == num)
		{
			System.out.println("It's a perfect number!");
		}
		else
		{
			System.out.println("It's not a perfect number!");
		}
	}

}
