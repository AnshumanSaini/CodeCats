//print Increasing sequence

import java.io.*;
import java.util.*;

class Q1
{
	static void fun(int N)
	{
		if(N==0) return;
		System.out.println(N);
		fun(N-1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		fun(5);
	}

}