class P7
{
	public static void main(String[] args) 
	{
		char c = 'o
		';
		int n = c;  //97 to 122
		
		if(n >= 97 && n <= 122)
		{
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
			{
			System.out.println(c+" :is vovel");
			}
			else
			{
			System.out.println(c+" :is not vovel");
			}
			}
		else
		{
			System.out.println(c+" :is uppercase character");

		}
	}
}
