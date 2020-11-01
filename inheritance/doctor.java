package com.inheritance;
import java.util.Scanner;

public class doctor extends Employee{
Scanner s=new Scanner(System.in);
String dc;
  public void diffOperation(){
    System.out.println("What type of Doctor :-");
    dc=s.next();
  }
  public void displayOp(){
    System.out.println(" Type of Doctor:- "+dc);
  }
}
