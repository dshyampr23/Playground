#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int c=0;
  do
  {
    c++;
    n=n/10;
  }while(n!=0);
  std::cout<<c;
}