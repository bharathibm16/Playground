#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  int i,j,k=0,l;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&j); 
  k=0;
  for(i=0;i<n;i++)
  {
   if(a[i]==j)
   {
   printf("%d",i+1);
     k=1;
     break;}
  } 
  if(k==0)
   printf("%d isn't present in the array.",j);
  return 0;
}