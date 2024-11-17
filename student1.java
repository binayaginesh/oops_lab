import java.io.*;
import java.util.*;

class student{
    int id;
    String name;
}

public class student1{
    public static void main(String[]args){
student s1 = new student();
student s2 = new student();

Scanner sc = new Scanner(System.in);
System.out.println("enter id of student 1:");
s1.id = sc.nextInt();
System.out.println("enter name of student 1:");
s1.name = sc.next();

System.out.println("enter id of student 2:");
s2.id = sc.nextInt();
System.out.println("enter name od student 2:");
s2.name = sc.next();

System.out.println("id and name of student 1 is : " +s1.id +" " +s1.name);
System.out.println("id and name of student 2 is : " +s2.id +" " +s2.name);


}
}
