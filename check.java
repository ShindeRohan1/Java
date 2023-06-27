class check 
{
	int n = 32;
	public void demo()
	{
		System.out.println("inside demo");
	}

	static public void sdemo()
	{
		check obj = new check();
		System.out.println(obj.n);
		obj.demo();
	}
	static
	{
		check obj1 = new check();
		System.out.println(obj1.n);
		obj1.demo();
	}

	
	
	public static void main(String[] args) 
	{
		
	sdemo();

	}
}
