#include <stdio.h>
int main() {
	// Type your code here
  char a,x,y;
  scanf("%c",&a);
  if(a>='a' && a<='z')
  {
    x=a-32;
    printf("%c",x);
  }
  else if(a>='A'&& a<='Z')
  {
    y=a+32;
    printf("%c",y);}
	return 0;
}