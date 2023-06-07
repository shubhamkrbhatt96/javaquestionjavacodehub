import java.util.Scanner;

public class checkelseifcondition {

	public static void main(String[] args) {
		System.out.println ("enter the age");
		int age;
		Scanner sc = new Scanner (System.in);
		age = sc.nextInt();
		if (age>=18)
		{
			System.out.println("adult");
		}
		else if (age>=13 && age<18)
		{
			System.out.println("teenager");
		}
		else
		{
			System.out.println("child");
		}
		
		
		}

	}


