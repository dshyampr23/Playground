#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char a[200];
  cin.getline(a,200);
  int i=0;
  while(a[i]!='\0')
  {
    if(a[i]=='t')
    {
      i++;
      if(a[i]=='h')
      {
        i++;
        if(a[i]=='e')
        {
          i++;
          if(a[i]==' ')
          {
            i++;
          }
        }
      }
      else
      {
        --i;
        std::cout<<a[i];
        i++;
        std::cout<<a[i];
        i++;
      }
    }
    else   
    {
      std::cout<<a[i];
      i++;
    }
  }
}