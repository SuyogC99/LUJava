package com.inheritance;

public class Main {

  public static void main(String[] args) {
  doctor[] d=new doctor[3];
  engineer[] e =new engineer[3];
  pilot[] p=new pilot[3];
  for(int i=0;i<d.length;i++){
    d[i]=new doctor();
    d[i].getDetails();
    d[i].diffOperation(); 
    System.out.println("----------------------------------------------");
    }
   for(int i=0;i<d.length;i++){
    d[i].displayDetails();
    d[i].displayOp();
    System.out.println("----------------------------------------------");
    
  }
  
  for(int i=0;i<e.length;i++){
    e[i]=new engineer();
    e[i].getDetails();
    e[i].diffOp(); 
    System.out.println("----------------------------------------------");
    }
   for(int i=0;i<d.length;i++){
    e[i].displayDetails();
    e[i].displayOperation(); 
    System.out.println("----------------------------------------------");
    
  }
  for(int i=0;i<p.length;i++){
    p[i]=new pilot();
    p[i].getDetails();
    p[i].differentOp(); 
    System.out.println("----------------------------------------------");
    }
   for(int i=0;i<d.length;i++){
    p[i].displayDetails();
    p[i].dispOp(); 
    System.out.println("----------------------------------------------");  
  }
  }
}
