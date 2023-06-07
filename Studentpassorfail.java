import java.util.Scanner;

public class Studentpassorfail {

	public static void main(String[] args) {
		System.out.println ("enter the marks");
		float marks;
		Scanner sc = new Scanner (System.in);
		marks = sc.nextFloat();
		String result = (marks>=33)?"Pass":"Fail";
		System.out.println ("The result of the student is "+result);

	}

}
