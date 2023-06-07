import java.util.Scanner;

public class leapyearornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (Syste.in);
		System.out.println("enter the year");
		int year;
		year = sc.nextInt();
		
		if (year%4==0)
		{
			System.out.println("year is a leap year");
		}
		else
		{
			System.out.println("year is not a leap year");
		}
	}

}
