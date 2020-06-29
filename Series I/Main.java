#include<iostream>
using namespace std;
int main()
{
  float start=0.5;
  int n;
  std::cin>>n;
  while((n--)!=0)
  {
    std::cout<<start<<" ";
    start*=3;
  }
}