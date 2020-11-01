package com.inheritance;
import java.util.Scanner;

public class pilot extends Employee{
Scanner s=new Scanner(System.in);
String c;
  public void differentOp(){
    System.out.println("In which airlines you are a Pilot:-");
    c=s.next();
  }
  public void dispOp(){
    System.out.println(" Airlines:- "+c);
  }
}
