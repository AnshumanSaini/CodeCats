import java.util.Scanner;

class Q7
{
    public static boolean checkAlmostEquivalent(String word1, String word2) 
    {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        int i=0;
        while(i<word1.length())
        {
            ++arr1[word1.charAt(i)-'a'];
            ++i;
        }
        i=0;
        while(i<word2.length())
        {
            ++arr2[word2.charAt(i)-'a'];
            ++i;
        }
        int flag=0;
        i=0;
        while(i<26)
        {
            if(Math.abs(arr1[i]-arr2[i])>3) flag=1;
            ++i;
        }
        if(flag==1) return false;
        else return true;
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String word1=sc.next();
		String word2=sc.next();
		System.out.println(checkAlmostEquivalent(word1,word2));
	}

}