#include <iostream>
int main() 
{
	// Type your code here
    int n;
    std::cin>>n;
    int d,rev=0;
    while(n>0)
    {
      d=n%10;
      rev=(rev*10)+d;
      n=n/10;
    }
    std::cout<<rev;
	return 0;
}