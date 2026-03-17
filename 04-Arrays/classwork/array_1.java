public class array_1
{
	public static void main(String[] args)
	{
		int arr[]=new int[5];
		arr[0]=99;
		arr[1]=67;
		arr[2]=108;
		arr[3]=45;
		arr[4]=70;
		System.out.println("length is:"+arr.length);
		System.out.println("Print an array using for loop:-");
		for (int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("print an array using for loop :-");
		for(int i:arr)
		{
			System.out.println(i);
		}
	
		
	}
}