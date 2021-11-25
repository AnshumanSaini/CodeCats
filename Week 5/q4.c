// Swap two elements using pointer

#include<stdio.h>
void swap(int *a, int *b)
{
	int temp=*a;
	*a=*b;
	*b=temp;
}
int main(void)
{
	int a,b;
	scanf("%d",&a);
	scanf("%d",&b);
	swap(&a,&b);
	printf("%d,%d",a,b);
	return 0;
}
