import java.util.*;
class fact2
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.print("enter a number: ");
		a = input.nextInt();
		int fact = 1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("the factorial is: "+fact);
	}
}