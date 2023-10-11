import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
  int rollno;
  String name;
  float per;
  static int count;

  Student(){}
  Student(String n,float p)
  {
     count++;
     rollno=count;
     name=n;
     per=p;
  }

void display()
{
  System.out.println(rollno+"\t"+name+"\t"+per);
}
float getper()
{
  return per;
}
/*static void counter()
   {
       System.out.println(count+" object is created");
   }*/
public static void sortStudent(Student s[],int n)
 {
  for(int i=n-1;i>=0;i--)
   {
     for(int j=0;j<i;j++)
      {
        if(s[j].getper()>s[j+1].getper())
         {
           Student t=s[j];
           s[j]=s[j+1];
           s[j+1]=t;
         }
       }
   }
    for(int i=0;i<n;i++)
        s[i].display();
 }
  public static void main(String args[]) throws IOException
  {          
     Scanner sc=new Scanner(System.in);
     //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter no. of Student:");
     //int n=Integer.parseInt(br.readLine()); 
      int n=sc.nextInt();
      Student p[]=new Student[n];
      for(int i=0;i<n;i++)
     {  
       System.out.println("Enter roll no.");
       int rno=sc.nextInt();
       System.out.print("Enter Name:");
       String name=sc.next();                                                
       //String name=br.readLine();
       System.out.print("Enter percentage:");
       float per=sc.nextFloat();   
       //float per=Float.parseFloat(br.readLine());
       p[i]=new Student(name,per);
      //p[i].counter();
     }
     Student.sortStudent(p,Student.count);
   }
}

/*Output:

Enter no. of Student:
 3
 Enter Name:amit
 Enter percentage:37
 1 object is created
 Enter Name:suresh
 Enter percentage:56
 2 object is created
 Enter Name:ramesh
 Enter percentage:55
 3 object is created
 1 amit 37.0
 3 ramesh 55.0

 2 suresh 56.0  */
           
