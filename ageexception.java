import java.lang.*;

class ageexception{

  void exception(int age){
    if(age<18){
    throw new ArithmeticException("invalid age");
  }
  else{
    System.out.println("valid age");
  }
  }
  
  public static void main(String[]args){
  int age = Integer.parseInt(args[0]);
     ageexception e = new ageexception();
     e.exception(age);
     
  
}
}
