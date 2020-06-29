#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t,s,a=0,sum=0;
  std::cin>>t;
  while(sum<t)
  {
    std::cin>>s;
    sum=sum+s;
    a++;
  }
  std::cout<<"The number of turns is "<<a;
    
}