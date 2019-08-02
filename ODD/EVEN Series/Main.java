#include<stdio.h>
int main()
{
	//type your code here
	int n,a=0,b=2,c,d=2,N,i=1;
  scanf("%d",&n);
  if(n%2!=0)
  { 
    c=(n+1)/2;
    N=a+(c-1)*2;
    printf("%d",N);
  }
  else
  {
    c=n/2;
    N=a+(c-1)*1;
    printf("%d",N);
  }
   return 0;   
}