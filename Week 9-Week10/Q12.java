// Print KeyPad Characters
import java.util.*;
import java.io.*;

class Q12
{
	
	static String[] code={"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	static ArrayList<String> KeyPad(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> mid=new ArrayList<>();
			mid.add("");
			return mid;
		}
		String temp_str=code[(int)(str.charAt(0)-'0')];
		String temp=str.substring(1);
		ArrayList<String> hld=KeyPad(temp);
		ArrayList<String> result=new ArrayList<>();
		int i=0;
		while(i<temp_str.length())
		{
			char ch=temp_str.charAt(i);
			for(String j : hld)
			{
				result.add(""+ch+j);
			}
			++i;
		}
		return result;
	}

	public static void main(String args[])
	{
		String str="678";
		ArrayList<String> result=KeyPad(str);
		System.out.println(result);
	}
}