//perform linear search using pointer in array

#include<stdio.h>

void find(int key, int *ptr)
{
	int i=0;
	while(i<5)
	{
		if(key==*ptr)
		{
			printf("FOUND!!");
			return;
		}
		++ptr;
		++i;
	}
	printf("NOT FOUND!!!");
}
int main(void)
{
	int key;
	int arr[5];
	int i=0;
	while(i<5)
	{
		scanf("%d",&arr[i]);
		++i;
	}
	scanf("%d",&key);
	find(key,arr);
	return 0;
}
