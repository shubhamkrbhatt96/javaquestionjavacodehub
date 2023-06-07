import java.util.Scanner;

public class sumoffirstnnaturalnumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
       		int sum=0;
		int i=1;
		
		
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		
System.out.println("sum of the number is:"+sum);
	}

}
