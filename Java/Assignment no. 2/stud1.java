import java.io.*;
import java.util.*;

class student
{
  int rno;
  static String name;
  float per;
  student(int rno,String name,float per)
  {
   this.rno=rno;
   this.name=name;
   this.per=per;
  }
  static void sort(student s[],int n)
  {
    for(int i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
      if(s[j].getper()<s[i].getper())
      {
       student temp=s[i];
       s[i]=s[j];
       s[j]=temp;
      }
     }
    }
   }
   System.out.println("Roll no :percentage");
   for(int i=0;i<n;i++)
   {
     System.out.println(""+rno"\t"+name"\t"+per"\t")
   }
}
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("\n Enter number of student :");
 int n=sc.nextInt();
 student od=new student();
 stu
