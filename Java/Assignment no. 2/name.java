import java.io.*;
import java.util.*;

public class name
{
   String fname,mname,lname;
   Scanner sc=new Scanner(System.in);
  
   void accept()
   {
    System.out.println("Enter first name:");
    fname=sc.next();
    System.out.println("Enter Second name:");
    mname=sc.next();
    System.out.println("Enter Third name:");
    lname=sc.next();
   }
   
   void display()
   {
    System.out.println("Last name:"+lname);
    System.out.println("First name:"+fname);

    String FirstM=mname.substring(0,1);
    String lastM=mname.substring(1,mname.length());
    FirstM=FirstM.toUpperCase();
    mname=FirstM+lastM; 
    System.out.println("Second name"+mname);
   }
   
   public static void main(String[]args)
   {
     name p1=new name();
     p1.accept();
     p1.display();
   }
}



/*Output:
java name.java
Enter first name:
Tejal 
Enter Second name:
Totaram
Enter Third name:
Chaudhary
Last name:Chaudhary
First name:Tejal
Second nameTotaram
*/




        
    
    
