package LAB;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int GST;
		int Maintenance;
		int Total;
		float Bill_Tot;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter GST: ");
		GST = sc.nextInt();
		System.out.println("Enter Maintenance: ");
		Maintenance = sc.nextInt();
		Total = GST + Maintenance;
		if(Total > 1000)
		{
			Bill_Tot = Total - (Total * 0.10f); 
			System.out.println("GST : " +GST);
			System.out.println("Maintenance Charges : " +Maintenance);
			System.out.println("Discount : 10%");
			System.out.println("Total Bill : " +Bill_Tot);
		}
		else 
		{
			Bill_Tot = Total - (Total * 0.05f); 
			System.out.println("GST : " +GST);
			System.out.println("Maintenance Charges : " +Maintenance);
			System.out.println("Discount : 5%");
			System.out.println("Total Bill : " +Bill_Tot);
			
		}
	}

}
