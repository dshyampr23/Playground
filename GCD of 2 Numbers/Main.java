#include<iostream>
using namespace std;
int gcd(int x,int y)
{
  int z=x%y;
  if(z==0)
    return y;
  else
    return gcd(y,z);
}
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}