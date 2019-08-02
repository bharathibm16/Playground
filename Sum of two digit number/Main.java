#include<stdio.h>
int a, b, c=11;
int sum; 
int main()
{
  scanf("%d",&c); 
  a=c/10;
  b=c%10;
  sum=a+b;
  printf("%d",sum); 
  return 0;
}