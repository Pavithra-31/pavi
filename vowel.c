#include<stdio.h>
int main()
{
char ch;
printf("enter the variable");
scanf("%c",&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
printf(" \n is vowel");
}
else
{
printf("\n is constant");
}
return 0;
}
