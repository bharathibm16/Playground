#include<stdio.h>
int a, b, c, d=789;
int main()
{
  scanf("%d",&d) ;
    a=d/100;
  b=d%10;
  c=a+b;
  printf("%d",c); 
    
  return 0;
}