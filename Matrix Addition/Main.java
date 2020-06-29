#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c;
  std::cin>>r;
  std::cin>>c;
  int a[10][10],b[10][10],d[10][10];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      d[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<d[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}