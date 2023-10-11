import java.util.*;
class pat
{
   String name;
   int id;
   int hrct;
   int olevel;
   pat(String name,int id,int hrct,int olevel)
   {
     this.name=name;
     this.id=id;
     this.hrct=hrct;
     this.olevel=olevel;
   }
}
class SetA1
{
  public static void main(String[] args)
  {
    int n,i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of Patient :");
    n=s.nextInt();
    pat []a=new pat[n];
    for(i=0;i<n;i++)
    {
       System.out.println("Enter the Details for Patient :"+(i+1));
       System.out.println("Enter name:");
       String name=s.next();
       System.out.println("Enter ID :");
       int id=s.nextInt();
       System.out.println("Enter HRCT REPORT :");
       int hrct=s.nextInt();
       System.out.println("Enter OXYGEN LEVEL :"); 
       int olevel=s.nextInt();
       a[i]=new pat(name,id,hrct,olevel);
    }
    for(i=0;i<n;i++)
    {
      if(a[i].olevel <95 && a[i].hrct >10)
      {
       try
       {
        throw new NullPointerException();
       }
       catch(Exception e)
       {
          System.out.println("Patienty is covid postive and Need to Hosptlize");
       }
      }
       else
       {
         System.out.println("\n Patient Name :"+a[i].name);
         System.out.println("Patient id :"+a[i].id);
         System.out.println("Patient HRCT Report :"+a[i].hrct);
         System.out.println("Patient Oxygen level :"+a[i].olevel);
       }
      }
  }
}

                   
/*
OUTPUT -                   
 ty8@pc39:~/Ty 8/Java/Assignment no. 4$ java SetA1
Enter the number of Patient :
3
Enter the Details for Patient :1
Enter name:
Sonali
Enter ID :
123
Enter HRCT REPORT :
12
Enter OXYGEN LEVEL :
99
Enter the Details for Patient :2
Enter name:
neha
Enter ID :
345
Enter HRCT REPORT :
60
Enter OXYGEN LEVEL :
90
Enter the Details for Patient :3
Enter name:
neha
Enter ID :
678
Enter HRCT REPORT :
30
Enter OXYGEN LEVEL :
91

 Patient Name :Sonali
Patient id :123
Patient HRCT Report :12
Patient Oxygen level :99
Patienty is covid postive and Need to Hosptlize
Patienty is covid postive and Need to Hosptlize                            
     
*/
