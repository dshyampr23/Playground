#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char a[101];
  int i=0,l=0;
  std::cin>>a;
  while(a[i]!='\0')
  {
    l++;
    i++;
  }
  std::cout<<"The number of letters in the name is "<<l;
}