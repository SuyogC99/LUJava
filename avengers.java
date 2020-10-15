package com.luassignment;
import java.util.Scanner;

public class avengers{
       String name,power,weapon,planet;
       int age;
       Scanner sc = new Scanner(System.in);
       public void getDetails(){
       System.out.println("enter avenger name");
        name = sc.next(); 
       System.out.println("enter avenger age");
        age = sc.nextInt();
       System.out.println("enter avenger power");
        power = sc.next();
       System.out.println("enter avenger weapon");
        weapon = sc.next();
       System.out.println("enter avenger planet");
        planet= sc.next();
       }
       public void displayDetails(){
          System.out.println("The name of avenger is "+name+" age "+age+" power "+power+" weapon "+weapon+" and planet is "+planet);
        }
          
  public static void main(String[] args){
       avengers[] a= new avengers[5];
       for(int i=0;i<5;i++){
       a[i]=new avengers();
       a[i].getDetails();
       }
       for(int i=0;i<5;i++){
       a[i].displayDetails();
       }
       
  }


}
