import sy.*;
import ty.*;
import java.io.*;
import java.util.*;

class Student
{
 int rollno;
 String name;
 int sytm,tytm,gt;
 float per;
 Student(int rno,String n)
 {
   rollno=rno;
   name=n;
 }
 
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of Student:");
  int n=sc.nextInt();
  Student st[]=new Student[n];
  Symarks sy[]=new Symarks[n]; 
  Tymarks ty[]=new Tymarks[n];
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter roll no.:");
   int rno=sc.nextInt();
   System.out.print("Enter Name:");
   String name=sc.next();
   //String name=br.readline();
   System.out.print("Enter sy marks of Computer zone out of 200:");
   int c=sc.nextInt();
   System.out.print("Enter sy marks of Electronics zone out of 200:");
   int e=sc.nextInt();
   System.out.print("Enter sy marks of Mathematics zone out of 200:");
   int m=sc.nextInt();
   System.out.print("Enter sy marks of ty Thoery out of 400:");
   int th=sc.nextInt();
   System.out.print("Enter sy marks of ty Practical out of 400:");
   int pr=sc.nextInt();
   st[i]=new Student(rno,name);
   sy[i]=new Symarks(c,e,m);
   ty[i]=new Tymarks(th,pr);

  }
  System.out.println("\n Rollno\tName\tComputer\tElec\tMathe\t Thoery\t Pratical");
  for(int i=0;i<n;i++)
      System.out.println(st[i].rollno+"\t"+st[i].name+"\t"+sy[i].ct+"\t\t"+sy[i].et+"\t"+sy[i].mt+"\t"+ty[i].tm+"\t"+ty[i].pm);
}
}

// calculate percentage
st[i].sytm=sy[i]mt+st[i].et;  
st[i].tytm=sy[i]tm+ty[i].pm;  
st[i].gt=sy[i]sytm+st[i].tytm;  
st[i].per=(st[i].gt*100)/1200;
if(st[i].per>=70)
   System.out.println("\n Student <"+st[i].name+"> Pass with A grade\n");
else if(st[i].per>=60)
   System.out.println("\n Student <"+st[i].name+"> Pass with B grade\n");
else if(st[i].per>=50)
   System.out.println("\n Student <"+st[i].name+"> Pass with C grade\n");
else if(st[i].per>=40)
   System.out.println("\n Student <"+st[i].name+"> Pass with D grade\n");
else
   System.out.println("\n Student <"+st[i].name+"> Fail\n");



/*  
java Student.java
Enter no. of Student:
1
Enter roll no.:
8
Enter Name:Tejal
Enter sy marks of Computer zone out of 200:100
Enter sy marks of Electronics zone out of 200:103
Enter sy marks of Mathematics zone out of 200:104
Enter sy marks of ty Thoery out of 400:120
Enter sy marks of ty Practical out of 400:121

 Rollno	Name	Computer	Elec	Mathe	 Thoery	 Pratical
8	Tejal	100		104	103	120	121
*/
