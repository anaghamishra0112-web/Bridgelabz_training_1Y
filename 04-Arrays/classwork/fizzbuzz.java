class fizzbuzz
{
	public static void main(String args[])
	{
		int num =20;
		if(num<=0)
		{
			System.out.println("invaild");
			return;
        }
		String result[]=new String[num];
		for (int i=1; i<num;i++)
		{
		if(i%3==0&&i%5==0)
		{
			result[i]="fizzbuzz";
		}
		else if(i%3==0)
		{
			result[i]="fizz";
		}
		else if(i%5==0)
		{
			result[i]="buzz";
		}
		else
		{
			result[i]=String.valueOf(i);
		}
		}
	}
}