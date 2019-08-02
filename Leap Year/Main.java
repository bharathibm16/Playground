#include<stdio.h>
int main()
{
  int N;
  scanf("%d",&N);
  if((N%400==0 && N%100!=0 ) ||( N%4==0 && N%400==0))
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  return 0;
}