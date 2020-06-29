#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   char s[100];
   std::cin.getline(s,100);
   int c=0,i;
   for(i=0;s[i]!='\0';i++)
   {
     if(s[i]==' ')
     {
       c++;
     }
   }
   if(c<=10)
   {
     std::cout<<"Caption eligible for the contest";
   }
   else
   {
     std::cout<<"Caption not eligible for the contest";
   }
}