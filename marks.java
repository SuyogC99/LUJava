package com.luassignment;
import java.util.Scanner;
public class marks {

  public static void main(String[] args) {
   int a,b,c,d,e,f;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the 1st subject marks");
   a = sc.nextInt();
    System.out.println("Enter the 2nd subject marks");
   b = sc.nextInt();
    System.out.println("Enter the 3rd subject marks");
   c = sc.nextInt();
    System.out.println("Enter the 4th subject marks");
   d = sc.nextInt();
    System.out.println("Enter the 5th subject marks");
   e = sc.nextInt();
   
   f= (a+b+c+d+e)*100/500;
   System.out.println(f);
   if(f>=90 && f<=100){
     System.out.println("Grade-A and percentage is "+f);
   }
   else if(f>=80 && f<90){
     System.out.println("Grade-B and percentage is "+f);
   }
   else if(f>=70 && f<80){
     System.out.println("Grade-C and percentage is "+f);
   }
   else if(f>=60 && f<70){
     System.out.println("Grade-D and percentage is "+f);
   }
   else if(f>=50 && f<60){
     System.out.println("Grade-E and percentage is "+f);
   }
   else {
     System.out.println("Fail , percentage is "+f);
   }
  }
}
