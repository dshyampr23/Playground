#include<iostream>
int main()
{
  int i,j,sum;
  int start,end;
  std::cin>>start;
  std::cin>>end;
  for(i=start;i<=end;i++)
  {
    sum=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        sum=sum+j;
      }
    }
    if(sum==i)
      std::cout<<i<<" ";
  }
}