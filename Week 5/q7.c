//programme to return the array in reverse order sung pointer

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
	int *ptr=&arr[4];
	
	i=0;
	while(i<5)
	{
		printf("%d ",*ptr);
		--ptr;
		++i;
	}
	return 0;
}
