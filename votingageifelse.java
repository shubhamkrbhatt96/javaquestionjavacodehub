import java.util.Scanner;

public class votingageifelse {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=18 && age<=29)
		{
			System.out.println("the person is alloowed to vote");
		}
		if (age>30 && age<42)
		{
			System.out.println("the person is unable to vote");
		}
		if (age>43&&age<70)
		{
			System.out.println("the voting ability is expired and get it renewed");
		}
		else
		{
			System.out.println("the person is robot");
		}
	}

}
