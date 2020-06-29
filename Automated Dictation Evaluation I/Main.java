#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[101],b[101];
  std::cin>>a;
  std::cin>>b;
  if(strcmp(a,b)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}