#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char a[1001];
  std::cin>>a;
  int i,j;
  for(i=0;a[i]!='\0';i++)
  {
    while(!((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z') || a[i]=='\0'))
    {
      for(j=i;a[j]!='\0';j++)
      {
        a[j]=a[j+1];
      }
      a[j]='\0';
    }
  }
  std::cout<<a;
}