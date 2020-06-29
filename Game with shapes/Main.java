#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a;
  std::cin>>b;
  c=2*a;
  if(b==c)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
} 