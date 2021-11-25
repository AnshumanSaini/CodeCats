//find the greatest among three numbers using pointers

#include<stdio.h>
void greater(int *p1, int *p2, int *p3)
{
	if(*p1>*p2)
	{
		if(*p1>*p3)
		{
			printf("a is greater!!!");
		}
		else
		{
			printf("b is greater!!!");
		}
	}
	else
	{
		if(*p2>*p3)
		{
			printf("b is greater!!!");
		}
		else
		{
			printf("c is greater!!!");
		}
	}
}
int main(void)
{
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	greater(&a,&b,&c);
	return 0;
}
