import java.io.*;
import java.util.*;

public class employee
{
 static int id=1;
 static String name="Tejal";
 static String dept="cs";
 static int sal=60000;
 
 
 employee()
 {
   this.id=id;
   this.name=name;
   this.dept=dept;
   this.sal=sal;
 }
 employee(int i1,String n2,String dp,int sal1)
 {
   this.id=i1;
   this.name=n2;
   this.dept=dp;
   this.sal=sal1;
 }
  
 public static void display()
 {
   System.out.println("Id:"+id);
   System.out.println("Name:"+name);
   System.out.println("Dept:"+dept);
   System.out.println("Salary:"+sal);
 }
 
 public static void main(String[]args)
 {
   employee e1=new employee();
   e1.display();
   
   employee e2=new employee(2,"abc","xyz",60000);
   e2.display();
 }
}  
   
/*   
OUTPUT   
Id:1
Name:Tejal
Dept:cs
Salary:60000
Id:2
Name:abc
Dept:xyz
Salary:60000
*/
 
