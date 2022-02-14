// Print KeyPad Characters
import java.util.*;
import java.io.*;

class Q13
{
	static ArrayList<String> getStair(int n)
	{
		if(n==0)
		{
			ArrayList<String> str=new ArrayList<>();
			str.add("");
			return str;
		}
		else
		{
			if(n<0)
			{
				ArrayList<String> str=new ArrayList<>();
				return str;
			}
		}
		ArrayList<String> path1=getStair(n-1);
		ArrayList<String> path2=getStair(n-2);
		ArrayList<String> path3=getStair(n-3);
		ArrayList<String> result=new ArrayList<>();
		for(String i : path1)
		{
			result.add(1+i);
		}
		for(String i : path2)
		{
			result.add(2+i);
		}
		for(String i : path3)
		{
			result.add(3+i);
		}
		return result;
	}
	public static void main(String args[])
	{
		int i=3;
		ArrayList<String> result=getStair(i);
		System.out.println(result);
	}
}