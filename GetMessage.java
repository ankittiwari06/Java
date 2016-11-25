import java.util.Scanner;
class GetMessage
{
	public static void main(String args[])
	{
		try
		{	
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			if(e.getMessage().equals("/ by 0"))
			{
				System.out.println("dont try with 0");
			}
			else
			{
				System.out.println("maxm 5 digit allowed");
			}
		}
	}

}