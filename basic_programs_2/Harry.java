 import java.util.Scanner;
 public class Harry
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter the birthYear");
		int birthYear= input.nextInt();
		System.out.println("enter the currentYear");
		int currentYear = input.nextInt();
		int age = currentYear - birthYear;
		System.out.println("current age of Harry is:"+age);
	}
}
		
		
		