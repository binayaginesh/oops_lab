import java.io.*;
import java.io.IOException;
import java.io.FileWriter;

public class filewrite{
  public static void main(String[]args){
  try{
    FileWriter fw = new FileWriter("binayaa.txt");
    fw.write("hi i am binaya\n");
    fw.write("i am fine\n");
    fw.close();
    }
    catch(IOException e){
       System.out.println("file not found");
    }
  }
}
