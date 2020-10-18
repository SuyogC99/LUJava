package com.quiz;
import java.util.Scanner;

public class Quiz {
  Scanner se=new Scanner(System.in);
  Ques[] questions=new Ques[5];
  Ques player=new Ques();
  String[] data={"Who is the prime minister of India?","Who is the captain of Indian Cricket team?","Who invented Java?","What is the range of byte data type in Java?","What is the current ranking of Virat Kohli in ODI?"};
  String[] option1={"Pranav Mukharjee","Rohit Sharma","Bjarne Stroustrup","-128 to 127","1"};
  String[] option2={"Sundar Pichhe","M.S. Dhoni","James Gosling","-32768 to 32767","2"};
  String[] option3={"Narendra Modi","R.Ashwin","Dennis Ritchie"," -2147483648 to 2147483647","3"};
  String[] option4={"Ambani","Virat Kohli","Guido van Rossum"," None of the mentioned","4"};
  int[] answers={3,4,2,1,1};
  public void Game(){
    for(int i=0;i<questions.length;i++){
      questions[i]=new Ques();
      questions[i].ques=data[i];
      questions[i].option1=option1[i];
      questions[i].option2=option2[i];
      questions[i].option3=option3[i];
      questions[i].option4=option4[i];
      questions[i].correctans=answers[i];
    }
   }
   public void play(){
   System.out.println("Instructions:-");
    System.out.println("1. Their will be 5 questions in total.");
    System.out.println("2. For every correct answer you will get +5.");
    System.out.println("3. For wrong answer your score will be -2." ) ;
    System.out.println("4. For skipping the question you have to type 5." ) ;
    System.out.println("Type true to move forward to the questions else type false");
    boolean b=se.nextBoolean();
    if(b!=true){
      System.out.println("Sorry :( you have not type the true..");
    }
    else{
     player.playerdetails();
     System.out.println("Best of Luck "+player.name+" ;)");
     for(int i=0;i<questions.length;i++){
        int stats=questions[i].askque();
        if(stats==1){
          player.score+=5;
          System.out.println("Well Played!! Thats right answer :)");
        }
        else if(stats==2){
          System.out.println("You have skipped the question :-|..");
        }
        else {
          player.score-=2;
          System.out.println("Sorry :( ..Thats wrong");
        }
      }
      System.out.println(player.name+" score is "+player.score+" out of 25");
     }
    }
    public static void main(String[] args){
     Quiz a=new Quiz();
     a.Game();
     a.play();
    }
    
  }


