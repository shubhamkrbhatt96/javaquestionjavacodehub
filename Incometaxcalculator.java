import java.util.Scanner;

public class Incometaxcalculator {

	public static void main(String[] args) {
		
		int income;
		int tax;
		System.out.println("enter the income"+" ");
		
		Scanner sc = new Scanner(System.in);
		income = sc.nextInt();
		if (income<500000)
		{
			tax =0;
		}
		else if (income>=5000000 && income<1000000)
		{
			tax = (int)(income*0.2);
		}
		else
		{
			tax = (int)(income*0.3);
		}
		System.out.println ("Your tax is "+tax);
	}
}


