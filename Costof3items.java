import java.util.Scanner;

public class Costof3items {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Float item1 = sc.nextFloat();
		Float item2 =sc.nextFloat();
		Float item3 = sc.nextFloat();
		Float total = item1+item2+item3;
		System.out.println(total);
		Float newTotal = total + (0.18f*total);
		System.out.println(newTotal);
		

	}

}
