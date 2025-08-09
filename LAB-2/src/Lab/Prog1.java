package Lab;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        
        if (str.length() >= 5) {
            System.out.println(str.substring(2, 5));
        } else {
            System.out.println("String too short for substring example");
        }
        
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', '@'));
        
        sc.close();
	}

}
