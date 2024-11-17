import java.io.*;
import java.util.*;
import java.io.IOException;

class randomnumber extends Thread{
   public void run(){
     Random rd = new Random();
     for(int i=0;i<5;i++){
     int randomint = rd.nextInt(100);
     System.out.println("Random positive number is "+randomint);
     
     if(randomint%2==0){
       eventhread ev = new eventhread(randomint);
       ev.start();
     }
     else{
        oddthread od = new oddthread(randomint);
        od.start();
     }
     try{
       Thread.sleep(1000);
     }
     catch(InterruptedException e){
       System.out.println("exception"+e);
     }
     
     
     
     }
   }
} 

class eventhread extends Thread{
  int num;
  eventhread(int randomint){
  num = randomint;
  }
   public void run(){
  for(int i=2;i<num;i=i+2){
    System.out.println(i);
  }
}
  }
  
class oddthread extends Thread{
  int num;
  oddthread(int randomint){
      num = randomint;
    }
   public void run(){
  for(int i=1;i<num;i=i+2){
    System.out.println(i);
  }
}
}  



public class thread2{
  public static void main(String[]args){
    randomnumber rm = new randomnumber();
    rm.start();
  }
}
