#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a[100],n;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int v,c=0;
  std::cin>>v;
  for(int i=0;i<n;i++)
  {
    if(a[i]==v)
    {
      c++;
    }
  }
  if(c==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
}