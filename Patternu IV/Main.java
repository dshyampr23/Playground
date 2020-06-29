#include <iostream>
using namespace std;
int main() {
    // Type your code here  
  int n,i,j; 
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<=n;j++)
      {
        if(j!=n)
        {
          std::cout<<i;
        }
        else
        {
          std::cout<<i+1;
        }
      }
    }
    else
    {
      for(j=1;j<=n;j++)
      {
        if(j!=1)
        {
          std::cout<<i;
        }
        else
        {
          std::cout<<i+1;
        }
      }
    }
    std::cout<<"\n";
  }
    
  
    return 0;
}