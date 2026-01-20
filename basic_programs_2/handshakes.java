import java.util.Scanner;
class handshakes
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("enter numberofstudent");
		int numberofstudent=input.nextInt();
		int numberofhandshakes=(numberofstudent*(numberofstudent-1));
		System.out.println("enter the numberofhandshakes:"+numberofhandshakes);
	}
}
		