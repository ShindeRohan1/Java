class P2 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 5;
		int c = 8;
		int d = 2;

		if(a > b && a > c &&  a > d)
		{
		System.out.println(a+" is maximum number");
		}
		else if (b > c && b > d)
		{
			System.out.println(b+" is maximum number");
		}
		else if (c > d)
		{
			System.out.println(c+" is maximum number");
		}
		else
		{
			System.out.println(d+" is maximum number");
		}

	}
}
