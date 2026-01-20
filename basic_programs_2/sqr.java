import java.util.Scanner;
public class sqr
{
	public static void main (String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter the length_of_side");
		int length_of_side=input.nextInt();
		int perimeter= length_of_side*4;
		System.out.println("enter the perimeter:"+perimeter);
	}
}