//Write a simple java program that generates 20 numbers randomly in a thread and if it is even generate a child thread that write the number to a file named "even.txt" and if it is odd write it to a file called "odd.txt" using another child thread. Display the contents of even.txt and odd.txt at the end. Use appropriate I/O streams for file handling



import java.io.*;
import java.util.*;
import java.io.FileWriter;


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
      synchronized(eventhread.class){
  try{
  FileWriter fr = new FileWriter("even.txt",true);
  fr.write(num +" ");
  fr.close();
  }
  catch(IOException e){
      System.out.println("exception " +e);
  }
 
}
  }
}


class oddthread extends Thread{
int num;
 oddthread(int randomint){
  num=randomint;
  }
 public void run(){
      synchronized(oddthread.class){
     try{
  FileWriter fr = new FileWriter("odd.txt",true);
  fr.write(num +" ");
  fr.close();
     }
     catch(IOException e){
      System.out.println("exception " +e);
  }
 
}
 } }


public class threadfile{
   public static void main(String[]args){
     randomnumber rn = new randomnumber();
     rn.start();
   }
}
