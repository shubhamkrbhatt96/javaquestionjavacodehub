import java.util.Scanner;

public class Positiveornegativenumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		int number;
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		if (number>0)
		{
			System.out.println("it is a positive number");
		}
		else
		{
			System.out.println("it is a negative number");
		}
	}

}
