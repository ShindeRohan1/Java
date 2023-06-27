class Q6
{
	public static String checkChar(char c)
	{
		if(c > 'a' && c < 'z')
		{
			return "lower";
		}
		else
		{
			return "upper";
		}
	}
	public static void main(String[] args) 
	{
		char ch = 'H';
		String res;

		res = checkChar(ch);
		System.out.println(res);
	}
}
