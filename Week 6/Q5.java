import java.util.Scanner;

class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.next();
		int i=0;
		int[] small=new int[26];
		int[] cap=new int[26];
		while(i<str2.length())
		{
			if(str2.charAt(i)<=90)
			{
				++cap[str2.charAt(i)-'A'];
			}
			else if(str2.charAt(i)<=122)
			     {
			     	++small[str2.charAt(i)-'a'];
			     }
			++i;
		}
		int count=0;
		i=0;
		while(i<str.length())
		{
			if(str.charAt(i)<=90)
			{
				if(cap[str.charAt(i)-'A']>=1) count+=cap[str.charAt(i)-'A'];
			}
			else if(str.charAt(i)<=122)
			     {
			     	if(small[str.charAt(i)-'a']>=1) count+=small[str.charAt(i)-'a'];
			     }
			++i;
		}
		System.out.println(count);
	}
}