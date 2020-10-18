package com.quiz;
import java.util.Scanner;

public class Ques {
  String ques,option1,option2,option3,option4,name,a;
  int userans,correctans;
  int score=0;
  Scanner s=new Scanner(System.in);
  public int askque(){
    System.out.println(ques);
    System.out.println("1. "+option1);
    System.out.println("2. "+option2);
    System.out.println("3. "+option3);
    System.out.println("4. "+option4);
    System.out.println("Choose any one option if you want to skip type 5");
    userans=s.nextInt();
    if(userans==correctans)
       return 1;
    else if(userans==5)
      return 2;
     else
      return 3;
  }
  public void playerdetails(){
  System.out.println("Enter your name");
  name=s.next();
    
  } 
}
