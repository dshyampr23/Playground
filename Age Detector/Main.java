#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a;
  std::cin>>b;
  if(a>b)
  {
    c=1900+a;
    d=2000+b;
    std::cout<<d-c;
  }
  else
  {
    c=2000+a;
    d=2000+b;
    std::cout<<d-c;
  }
}