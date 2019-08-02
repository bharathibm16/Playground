#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,j;
  int a[100];
  scanf("%d",&n);
  for(i=0;n>0;i++)
  {  a[i] =n%2;
      n=n/2;
  }
  for(j=i-1;j>=0;j--)
     printf("%d",a[j]);
  
    return 0;
}