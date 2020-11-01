package com.inheritance;
import java.util.Scanner;
public class Employee {
  String name,designation;
  int age;
  double salary;
  Scanner s=new Scanner(System.in);
  public void getDetails(){
    System.out.println("Enter the name:");
    name=s.next();
    System.out.println("Enter the age:");
    age=s.nextInt();
    System.out.println("Enter the salary in Rs:");
    salary=s.nextDouble();
    System.out.println("Enter the designation:-");
    designation=s.next();
    
  }
  public void displayDetails(){
    System.out.println(" Name:- "+name+"\n Age:- "+age+"\n Salary:- Rs. "+salary+"\n Designation:- "+designation);
  }

}
