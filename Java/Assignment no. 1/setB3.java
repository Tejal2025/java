import java.io.*;
import java.util.*;

class setB3
{
  public static void main(String[]args)
  {
    int m,n,p,q,i,j,k,op=1;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("\n Enter number of rows for first matrix:");
    m=sc.nextInt();
    System.out.println("\n Enter number of columns for first matrix:");
    n=sc.nextInt();
    
    int[][] a=new int[m][n];
    
    //accept
    System.out.println("\n Enter first matrix");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        
    //display
        System.out.println("\n First Matrix is :");
       for(i=0;i<m;i++)
       {
          for(j=0;j<n;j++)
          {
             System.out.println(" "+a[i][j]+" "); 
          }
        System.out.println(" ");  
      }
      
      //Second matrix 
   System.out.println("\n Enter no rows for second matrix:");
   p=sc.nextInt();
   System.out.println("\n Enter no of columns for second matrix :");
   q=sc.nextInt();
   
   int[][]b=new int[p][q];
   //int[][] c=new int[p][q];
   //accept
   System.out.println("\n Enter Second matrix :");
   
   for(i=0;i<p;i++)
    for(j=0;j<q;j++)
        b[i][j]=sc.nextInt();
   //display
   System.out.println("\n Second matrix is:");
   for(i=0;i<p;i++)
   {
     for(j=0;j<q;j++)
        System.out.println(" "+b[i][j]+" ");
   }
  System.out.println(" ");
 }
System.out.println("--------------------------------------------------");

 while(op>=1 && op<=4)
 {
    System.out.println("1.Addition");
    System.out.println("2.Multiplication");
    System.out.println("3.Transpose");    
    System.out.println("4.Exit");
    System.out.println("Enter option:");
    op=sc.nextInt();
    switch(op)
    {
         case 1:
                if(m == p && n == q)
                {
                  int[][] c=new int[m][n];
                  System.out.println("\n addition ");
                  for(i=0;i<m;i++)
                  {
                   for(j=0;j<n;j++)
                   {
                     c[i][j]=a[i][j]+b[i][j];
                     System.out.println(" "+c[i][j]+" ");
                   }
                  System.out.println(" ");
                }
    }
        else
        
            System.out.println("\n addition is not  possible");
            System.out.println(" ");
        
            break;
            
        case 2:
               if(n==p)
               {
                 int[][] c=new int[m][q];
                 System.out.println("\n multiplication");
                 for(i=0;i<m;i++)
                 {
                  for(j=0;j<q;j++)
                  {
                   c[i][j]=0;
                   for(k=0;k<n;k++)
                   {
                    c[i][j]+=a[i][k]*b[k][j];
                   }
                    System.out.println(" "+c[i][j]+" ");
                   }
                   System.out.println(" ");
                  }
                }
              
           
              else
              
                System.out.println("\n multiplication is not possible"); 
                System.out.println(" ");
                System.out.println("------------------------------------------------");
              break;
              
       case 3:
              System.out.println("---------------------------------------------------");
              System.out.println("\n Transpose");
              for(i=0;i<n;i++)
              {
               for(j=0;j<m;j++)
                {
                 System.out.println(" "+a[i][j]+" "); 
                }
                System.out.println(" ");   
              }
              System.out.prinln("-------------------------------------------------------");
              break;
       case 4:
              System.exit(0);
              break;
       default:
              System.out.println("\n Enter valid option");
              break;
   }
  }
 }              
}             
 
