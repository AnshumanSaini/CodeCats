//programme to find greater element using pointer

#include<stdio.h>
void greater(int *p1, int *p2)
{
	if(*p1>*p2) printf("a greater");
	else printf("b is graeter");
}
int main(void)
{
	int a,b;
	scanf("%d",&a);
	scanf("%d",&b);
	greater(&a,&b);
	return 0;
}
