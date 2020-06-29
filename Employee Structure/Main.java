#include<iostream>
using namespace std;
struct employee {
   char name[50];
   int id;
   int age;
   char designation[50];
   int salary;
};
int main() 
{
  employee e;
  std::cout<<"Enter name:\n";
  std::cin>>e.name;
  std::cout<<"Enter ID:\n";
  std::cin>>e.id;
  std::cout<<"Enter age:\n";
  std::cin>>e.age;
  std::cout<<"Enter designation:\n";
  std::cin>>e.designation;
  std::cout<<"Enter Salary:\n";
  std::cin>>e.salary;
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : "<<e.name;
  std::cout<<"\nID of the Employee : "<<e.id;
  std::cout<<"\nAge of the Employee : "<<e.age;
  std::cout<<"\nDesignation of the Employee : "<<e.designation;
  std::cout<<"\nSalary of the Employee : "<<e.salary;
}