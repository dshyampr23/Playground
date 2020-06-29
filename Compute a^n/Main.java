#include<iostream>
using namespace std;
int power(int x,int y)
{
  if(y!=0)
    return (x*power(x,y-1));
  else
    return 1;
}
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  std::cout<<"Enter the value of a";
  std::cout<<"\nEnter the value of n";
  std::cout<<"\nThe value of "<<a<<" power "<<b<<" is "<<power(a,b);
}