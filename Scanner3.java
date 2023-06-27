import java.util.Scanner;

class Scanner3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int icnt = 0;
		for(int i = 2;i < a; i++)
		{
			if(a % i == 0)
			{
				icnt++;
				break;
			}
		}
		if(icnt == 0)
		{
			System.out.println("Entered number is prime");
		}
		else
		{
			System.out.println("Entered number is not prime");
		}

	}
}
