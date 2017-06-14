#include<stdio.h>
int main()
{
    char f;
    printf("enter the symbol");
    scanf("%c",&f);
    if((f>='a'&&f<='z')||(f>='A'&&f<='Z'))
    {
        printf("%c is alphabet",f);
    }
    else
    {
        printf("%c is not alphabet",f);
    }
    return 0;
}
