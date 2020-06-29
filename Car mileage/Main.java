#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  float d;
  std::cin>>d;
  std::cin>>a;
  std::cin>>b;
  c=d*a;
  if(c>=b)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}