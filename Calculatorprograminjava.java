import java.util.Scanner;

public class Calculatorprograminjava {

	public static void main(String[] args) {
	
	int a, b;
	char op;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the a");
	a= sc.nextInt();
	System.out.println("enter the b");
	b=sc.nextInt();
	System.out.println("enter the operator");
	 op = sc.next().charAt(0);
	
	switch(op)
	{
	case '+' : System.out.println(a+b);
	           break;
	case '-' : System.out.println(a-b);
               break;
	case '*' : System.out.println(a*b);
               break;
	case '/' : System.out.println(a/b);
               break;
    default: System.out.println("the operator is invalid");
	         
	}

	}

}
