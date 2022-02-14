//Print SubSequence of String using Recurssion
import java.util.*;
import java.io.*;

class Q11
{
	static ArrayList<String> subSec(String str)
	{
		if(str.length()==0) 
		{
			ArrayList<String> end=new ArrayList<>();
			end.add("");
			return end;
		}
		char ch=str.charAt(0);
		String hld=str.substring(1);
		ArrayList<String> temp=subSec(hld);
		ArrayList<String> result=new ArrayList<>();
		for(String i : temp)
		{
			result.add(""+i);
			result.add(ch+i);
		}
		return result;
	}
	public static void main(String args[])
	{
		String str="abc";
		ArrayList<String> list=subSec(str);
		System.out.println(list);
	}
}