#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  if(((b*75)+(c*30))<=a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}