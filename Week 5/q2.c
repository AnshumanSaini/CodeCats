//Show elements in array using pointer

#include<stdio.h>

int main(void)
{
	int arr[5];
	int i=0;
	while(i<5)
	{
		scanf("%d",&arr[i]);
		++i;
	}
	int *ptr=arr;
	i=0;
	printf("\nElemts in array are: \n");
	while(i<5)
	{
		printf("%d ",*ptr++);
		++i;
	}
	return 0;
}
