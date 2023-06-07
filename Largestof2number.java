import java.util.Scanner;

public class Largestof2number {

	public static void main(String[] args)
	{
	int no1,no2,largest;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number");
	no1 = sc.nextInt();
	System.out.println("enter the second number");
	no2 = sc.nextInt();
	if (no1>=no2)
	{
		largest = no1;
	}
	else
	{
		largest = no2;
	}
	 System.out.println("\nLargest = " +largest);
	}
}