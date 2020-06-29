#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int i,a[n];
  int e=0,o=0;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e=e+a[i];
    else
      o=o+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<e;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<o;
}