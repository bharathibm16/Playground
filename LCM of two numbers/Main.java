
#include <stdio.h>
// Main function
int main()
{
  int a,b,i,j,l;
  scanf("%d%d",&a,&b);
  for(i=1;i<=a && i<=b;i++)
  {
    if(a%i==0 && b%i==0)
      j=i;   
  }
  l=(a*b)/j ;
  printf("%d",l);
   return 0;
}