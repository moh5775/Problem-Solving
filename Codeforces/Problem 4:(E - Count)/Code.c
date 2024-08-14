#include<stdio.h>
int main ()
{
    char s1[1000000];
    scanf("%s",&s1);
    int i;
    int sum=0;
    for(i=0; s1[i]!='\0'; i++)
    {
            sum=sum+(s1[i]-'0');
    }
    printf("%d\n",sum);
}