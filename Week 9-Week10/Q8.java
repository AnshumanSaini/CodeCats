//print array using recursion

import java.io.*;
import java.util.*;

class Q8
{
	static void printArray(int[] arr,int ind)
	{
		if(ind<0) return;
		printArray(arr,ind-1);
		System.out.println(arr[ind]);
	}
	public static void main(String args[])
	{
		int[] arr={10,20,30,40,50,60};
		printArray(arr,arr.length-1);
	}
}