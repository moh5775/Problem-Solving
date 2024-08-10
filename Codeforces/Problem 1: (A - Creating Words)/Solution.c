#include<stdio.h>
#include<string.h>
int main ()
{
    char str[10];
    int n;
    scanf("%d",&n);
    int i ;
    getchar();
    for(i=1; i<=n; i++)
    {
        fgets(str,sizeof(str),stdin);

        char temp;

        temp=str[0];
        str[0]=str[4];
        str[4]=temp;

        printf("%s",str);
        
    }
}
