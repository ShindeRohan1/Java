import java.util.Scanner;

//create user define array
class Scanner4
{
	public static void main(String[] args) 
	{
         

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
        int[] arr = new int[size];
		System.out.println("Enter Elements of array");
        for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(" "+arr[i]);

		}
		System.out.println("Enter Elements of to search in giver array");
		int a = sc.nextInt();
        boolean check = false;
		for(int i = 0; i < arr.length; i++
		{
			if(arr[i] == a)
			{
				check = true;
				break;
			}
		}
		if(check == true)
			System.out.println(a +"present");
	     }
		 else
	     {
			 System.out.println(a +"not present");
		 }

				


		
		
	}
}
