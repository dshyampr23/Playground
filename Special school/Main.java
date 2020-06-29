#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
void strrev(char *str)
{
  int i=0,j=0;
  while(str[j+1])
  {
    j++;
  }
  while(i<j)
  {
    char temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    i++;
    j--;
  }
}
int main()
{
  char str1[100],str2[101];
  std::cin>>str1;
  std::cin>>str2;
  strrev(str1);
  if(strcmp(str2,str1)==0)
  {
    std::cout<<"It is correct";
  }
  else
  {
    std::cout<<"It is wrong";
  }
}