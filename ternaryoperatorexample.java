import java.util.Scanner;

public class ternaryoperatorexample {

	public static void main(String[] args) {
		System.out.println ("enter the number");
		int number;
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		String type = (number%2==0)?"even":"odd";
		System.out.println("the number is "+type);
	}

}
