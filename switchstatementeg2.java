import java.util.Scanner;

public class switchstatementeg2 {

	public static void main(String[] args) {
		System.out.println("Enter the menu number");
		String ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next();
		switch(ch)
		{
			case "a" : System.out.println("Samosa");
			break;
			case "b" : System.out.println("jalebi");
			break;
			case "c" : System.out.println("rasgolla");
			break;
			default: System.out.println("no items left");
		}
		}
}
