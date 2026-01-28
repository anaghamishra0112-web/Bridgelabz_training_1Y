import java.util.Scanner;
class integer{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a ;
		System.out.println("enter the first number ");
		a=input.nextInt();
		for(int i=1;i<=a;i++)
		{
			if (i%2==0)
			{
				System.out.println("the even number is: "+i);
				System.out.println(" ");
			}
			else 
			{
				System.out.println("the odd number is: "+i);
			}
		}
	}
}
		