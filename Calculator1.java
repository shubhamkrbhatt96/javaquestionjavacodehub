import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a, b;
	char op;
	System.out.println ("enter a ");
	a= sc.nextInt();
	System.out.println ("enter b");
	b=sc.nextInt();
	System.out.println ("enter the operator");
	
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
	default: System.out.println("Wrong operator");
	break;
	}
	}

}
