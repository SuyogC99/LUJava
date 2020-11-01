package com.inheritance;
import java.util.Scanner;

public class engineer extends Employee{
Scanner s=new Scanner(System.in);
String ec;
  public void diffOp(){
    System.out.println("What type of Engineer :-");
    ec=s.next();
  }
  public void displayOperation(){
    System.out.println(" Type of Engineer:- "+ec);
  }
}
