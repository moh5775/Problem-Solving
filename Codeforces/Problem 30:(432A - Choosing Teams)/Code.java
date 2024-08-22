#include<stdio.h>
int main ()
{
    int n,k,i;
    scanf("%d %d",&n,&k);
    int a[n];
    int count=0;
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
        if(a[i]+k<=5)
            count++;
    }
    printf("%d\n",count/3);
}