#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50][50];
  int i,n=0;
  for(i=0;i<5;i++)
  {
    cin.getline(a[i],50);
    n++;
    if(!strcmp(a[i],"####"))
    {
      break;
    }
  }
  std::cout<<a[0]<<endl;
  for(i=0;i<n;i++)
  {
    if(a[i][strlen(a[i])-1]==a[i+1][0])
    {
      std::cout<<a[i+1]<<endl;
    }
  }
}