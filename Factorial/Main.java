#include<stdio.h>
int main()
{
	long int n,i,prd=1;
  scanf("%ld",&n);
  if(n==0||n==1)
    printf("1");
  for(i=2;i<=n;i++)
  {
    prd= prd*i;
  }
    printf("%ld",prd);
  
  return 0;
}