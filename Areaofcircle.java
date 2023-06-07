import java.util.*;
public class Areaofcircle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float r =sc.nextFloat();
		float area =  3.14f*r*r;   //To make the value float we keep the 3.14 along with small f so to treat it as float by compiler.
		System.out.println("The area of the circle is :");
		System.out.println(area);
		}

}
