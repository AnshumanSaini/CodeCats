//print decreasing-increasing sequence

import java.util.*;
import java.io.*;

class Q3
{
	static void fun(int N)
	{
		if(N==0) return;
		System.out.println(N);
		fun(N-1);
		System.out.println(N);
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		fun(5);
	}
}