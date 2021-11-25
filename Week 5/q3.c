//show the length of string using pointer

#include<stdio.h>

int main(void)
{
	char ch[]="Hey There";
	char *ptr=ch;
	int count=0;
	while((*ptr++)!='\0') ++count;
	printf("The size of String is: %d",count);
	return 0;
}
