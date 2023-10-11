import java.util.*;
import java.util.*;

class switch_case
{
    public static void main(String[]args)
    {
      int length,breadth;
      Scanner sc=new Scanner(System.in);
      
      int r,h,fact=1,op=1,num;
      float PI=3.14f;
      while(op >=1 && op <= 4)
      {
        System.out.println("1:Volume of cylinder :");
        System.out.println("2:Factorial of number:");
        System.out.println("3:Armstrong or not :");
        System.out.println("4:Exit");
        System.out.println("\n Enter option:");
        op=sc.nextInt();
        
        switch(op)
        {
           case 1:
                 System.out.println("Enter radius of cylinder:");
                 r=sc.nextInt();
                 System.out.println("Enter height of cylinder:");
                 h=sc.nextInt();
                 System.out.println("Volume of cylinder="+PI*r*r*h);
                 break;
                 
           case 2:
                 System.out.println("Enter number to find factorial:");
                 num=sc.nextInt();
                 for(int i=0;i<num;i++)
                     fact=fact*i;
                     System.out.println("\n Factorial of number:"+fact);
                break;
      
           case 3:
                  System.out.println("Enter the number to find the factorial:");
                  num=sc.nextInt();
                  int rem,num1,res=0;
                  num1=num;
                  while(num1 !=0)
                  {
                     rem=num1 %10;
                     res=res+(rem*rem*rem);
                     num1/=10;
                  }
                  if(res==num)
                     System.out.println("\n "+num+"%d is armstrong number:");
                  else
                     System.out.println("\n "+num+"%d is not armstrong number:");
                  break;
            
           case 4:
                  System.exit(0);
        }   
     }
  }
}
      
