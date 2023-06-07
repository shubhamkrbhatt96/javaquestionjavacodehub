import java.util.Scanner;

public class Printlargestofthreenumbers {

	public static void main(String[] args) {
		int largestno,a,b,c;
		System.out.println ("enter the three numbers"+" ");
	Scanner sc = new Scanner(System.in);
	 a = sc.nextInt();
	 b = sc.nextInt();
	 c =sc.nextInt();
	if ((a>=b) && (a>=c))
	{
		largestno  = a;
	}
	else if  (b>=c&&b>=a)
	{
		largestno  = b;
	}
	else
	{
		largestno = c;
	}
	System.out.println("the largest of three number is " +largestno);
	}
}
