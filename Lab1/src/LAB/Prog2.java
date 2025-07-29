package LAB;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=3;
		System.out.println("Apples in Jerry's bag before swapping : " +a);
		System.out.println("Apples in Tom's bag before swapping : " +b);
		int temp;
		temp = a;
		a = b;
		b= temp;
		System.out.println("Apples in Jerry's bag after swapping " +a);
		System.out.println("Apples in Tom's bag after swapping " +b);
	}
}