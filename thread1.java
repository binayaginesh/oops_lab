import java.io.*;
import java.util.*;
import java.io.IOException;


class randomnumber extends Thread{
   public void run(){
   Random rd = new Random();
   for(int i=0;i<5;i++){
     int randomint = rd.nextInt(100);
     System.out.println("Random integer "+randomint);
     
     if(randomint%2==0){
       eventhread ev = new eventhread(randomint);
       ev.start();
       
     }else{
       oddthread od = new oddthread(randomint); 
       od.start();   
       
     }
     try{
       Thread.sleep(1000);
     }
     catch(InterruptedException e){
       System.out.println("exception occured"+e);     
     }
   }
   
}
  }
 
class eventhread extends Thread{
int num;
 eventhread(int randomint){
  num=randomint;
  }
  public void run(){
  System.out.println("square of "+num+" = "+(num*num));
  System.out.println(" "); 
}
  }


class oddthread extends Thread{
int num;
 oddthread(int randomint){
  num=randomint;
  }
 public void run(){
  System.out.println("cube of "+num+" = "+(num*num*num)); 
  System.out.println(" ");
}
 }


public class thread1{
   public static void main(String[]args){
     randomnumber rn = new randomnumber();
     rn.start();
   }
}
