//Write the programme to add two numbers using pointers

#include<stdio.h>
void add(int *a,int *b)
{
	*a=*a+*b;
}
int main(void)
{
	int a,b;
	scanf("%d",&a);
	scanf("%d",&b);
	add(&a,&b);
	printf("The sum of two numbers is:- %d",a);
	return 0;
}
