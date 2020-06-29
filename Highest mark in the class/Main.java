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
  int max=a[0];
  for(int i=0;i<n;i++)
  {
    if(a[i]>max)
    {
      max=a[i];
    }
  }
  std::cout<<max;
}