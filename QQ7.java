class QQ7
{
	public static String summation()
	{
		int sum = 0;
		
		for(int i = 0; i <= 10; i++)
		{
			sum = sum + i;
		}
		
		return sum + "";
	}
		
	public static void main(String[] args) 
	{
		String ret = summation();
		System.out.println(ret);
	}
}
