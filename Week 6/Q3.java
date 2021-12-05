import java.util.Scanner;

class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] arr=new int[26];
		int K=sc.nextInt();
		int i=0;
		while(i<str.length())
		{
			++arr[str.charAt(i)-'a'];
			++i;
		}
		i=0;
		while(i<str.length())
		{
			if(arr[str.charAt(i)-'a']>=K)
			{
				System.out.print(str.charAt(i));
			}
			++i;
		}
	}
}