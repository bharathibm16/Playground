#include<stdio.h>
int main()
{
  int a=6,b=8;
  scanf("%d%d",&a,&b);
        if(a>b)
        {
          printf("num1 is the greatest",a);
        }
        else if(a<b)
        {
          printf("num2 is the greatest",b);
        }
        else
        {
          printf("Both number equal");
        }
  return 0;
}