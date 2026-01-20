import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the base");
		int base= input.nextInt();
		System.out.println("enter the height");
		int height= input.nextInt();
		int area_of_triangle=(base*height)/2;
		System.out.println("Enter the area_of_triangle:"+area_of_triangle);
	}
}
		