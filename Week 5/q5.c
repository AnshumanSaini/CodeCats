//Find Factorial using pointers

#include<stdio.h>

void fact(int *ptr)
{
	int i=0;
	int fact=1;
	while(i++<(*ptr)) fact*=i;
	*ptr=fact;
}
int main(void)
{
	int num;
	scanf("%d",&num);
	fact(&num);
	printf("%d",num);
	return 0;
}
