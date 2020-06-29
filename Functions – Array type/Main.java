#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int i;
  int o=0,e=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==1)
      o++;
    if(a[i]%2==0)
      e++;
  }
  std::cout<<"Enter the number of elements in the array";
  std::cout<<"\nEnter the elements in the array";
  if(o==n)
    std::cout<<"\nThe array is Odd";
  else if(e==n)
    std::cout<<"\nThe array is Even";
  else
    std::cout<<"\nThe array is Mixed";
}