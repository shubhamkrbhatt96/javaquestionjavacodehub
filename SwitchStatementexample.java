import java.util.Scanner;

public class SwitchStatementexample {

	public static void main(String[] args) {
	System.out.println("Choose the menu");
	int menu;
	Scanner sc = new Scanner(System.in);
	menu = sc.nextInt();
	switch(menu)
	{
	case 1 : System.out.println ("ColaCola");
	break;
	case 2 : System.out.println ("frenchfries");
	break;
	case 3 : System.out.println ("Momos");
	break;
	default: System.out.println("Plain Water");
	}
	}
}

