#include<stdio.h>
int main()
{
  //type your code here
  int n,a,i;
  int arr[100];
  scanf("%d",&n);
  while(n!=0)
  {
    arr[a++]=n%8;
    n=n/8;
  }
  for(i=a-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}