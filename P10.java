class P10 
{
	public static void main(String[] args) 
	{
		int radius = 5;
		float pi = 3.14f;
		float area = pi * radius * radius;
		int areai = (int)area;


	System.out.println(area);
	System.out.println(areai);
		if( areai % 2 == 0)	
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
