#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k=0;
  std::cin>>n;
  for(i=n;i<n+4;i++)
  {
    for(j=0;j<=k;j++)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
    k++;
  }
  for(i=n+3;i>=n;i--)
  {
    for(j=k;j>0;j--)
    {
      std::cout<<i;
    }
    std::cout<<"\n";
    k--;
  }
}