#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n],index,x;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>index;
  std::cin>>x;
  if(index>n)
  {
    std::cout<<"Enter the number of elements in the array";
    std::cout<<"\nEnter the elements in the array";
    std::cout<<"\nEnter the location where you wish to insert an element";
    std::cout<<"\nInvalid Input";
  }
  else
  {
    std::cout<<"Enter the number of elements in the array";
    std::cout<<"\nEnter the elements in the array";
    std::cout<<"\nEnter the location where you wish to insert an element";
    std::cout<<"\nEnter the value to insert";
    std::cout<<"\nArray after insertion is"<<"\n";
    for(int i=0;i<index-1;i++)
    {
      std::cout<<a[i]<<"\n";
    }
    std::cout<<x<<"\n";
    for(int i=index-1;i<n;i++)
    {
      std::cout<<a[i]<<"\n";
    }
  }
}