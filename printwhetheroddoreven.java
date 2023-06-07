import java.util.Scanner;

public class printwhetheroddoreven {

	public static void main(String[] args) {
		System.out.println ("enter the number");
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		if (n%2==0)
		{
			System.out.println ("the no is even");
		}
		else
		{
			System.out.println ("the no is odd");
		}

	}

}
