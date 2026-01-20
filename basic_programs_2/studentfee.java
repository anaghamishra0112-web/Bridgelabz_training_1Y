import java.util.Scanner;
class studentfee
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int fee= input.nextInt();
		System.out.println("enter the discountamount:");
		int discountamount=input.nextInt();
		int discountfee= fee-discountamount;
		System.out.println("discountfee:"+discountfee);
	}
}
		
		
		
		
		
		