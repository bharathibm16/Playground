#include <stdio.h>
int main()
{
  int i,b,p,ans=1;
  scanf("%d%d",&b,&p);
  if(p>=0)
  {
    for(i=1;i<=p;i++)
    {
      ans=ans*b;
    }
    printf("%d",ans);
  }
  else
    printf("Wrong input");
    return 0;
}