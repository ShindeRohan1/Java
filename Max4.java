class Max4Q4 
{
	public static int maximum(int a, int b , int c , int d)
	{
		if(a > b && a > c && a > d)
		{
			return a;
		}
		else if(b > c && b > d)
		{
			return b;
		}
		else if (c > d)
		{
			return c;
		}
		else
		{
			return d;
		}
	}

	public static void main(String[] args) 
	{
		int no1 = 23;
		int no2 = 24;
		int no3 = 62;
		int no4 = 27;

		int max = 0;
		max = maximum(no1,no2,no3,no4);
		System.out.println(max);
	}
}
