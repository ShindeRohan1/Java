class CheckEvenOddQ5 
{
	public static boolean evenOdd(int no)
	{
		if(no % 2 ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		int number = 3;
		boolean check = false;

		check = evenOdd(number);
		if(check == true)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
