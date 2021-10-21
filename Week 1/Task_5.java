import java.util.Scanner;

class Task_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.next().charAt(0);
		
		if(i>=48 && i<=57)
		{
			System.out.println("It is a DIGIT !!!!!!!!");
		}
		if((i>=32 && i<=47) || (i>=58 && i<=64) || (i>=91 && i<=96) || (i>=123 && i<=126)) 
		{
			System.out.println("It is a SPECIAL CHARACTER !!!!!!!");
		}

		if(i>=65 && i<=90)
		{
			System.out.println("It is a CAPITAL LETTER !!!!!!");
		}
		if(i>=97 && i<=122)
		{
			System.out.println("It is a SMALL LETTER !!!!!!!");
		}
	}
}