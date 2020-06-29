#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  int t;
  std::cin>>n;
  int sum=0;
  t=n;
  while(t)
  {
    sum=sum+(t%10);
    t=t/10;
  }
  int res=n%sum;
  if(res==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}