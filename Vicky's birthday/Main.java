#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  if(a>1995)
  {
    if(a%4==0)
    {
      std::cout<<"Vicky can celebrate his birthday.";
    }
    else
    {
      std::cout<<"Vicky can't celebrate.";
    }
  }
  else
  {
    std::cout<<"Vicky can't celebrate.";
  }  
}