//show the sum of elements in array using pointers

#include<stdio.h>

int main(void)
{
	int i=0;
	int arr[5];
	int sum=0;
	int *ptr=arr;
	while(i<5)
	{
		
		scanf("%d",ptr[i]);
		sum+=ptr[i];
		++i;
	}
	printf("%d",sum);
	
	return 0;
}
