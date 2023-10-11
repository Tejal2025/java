import java.io.*;
import java.util.*;

public class sort
{
  public static void main(String[]args)
  {
    int[]arr=new int[5];
    for(int i=0;i<5;i++)
    {
      arr[i]=Integer.parseInt(args[i]);
    }
    System.out.println("The array is:");
    for(int i=0;i<5;i++)
    {
      for(int j=i+1;j<5;j++)
      {
        if(arr[j]<arr[i])
        {
         int temp=arr[j];
         arr[j]=arr[i];
         arr[i]=temp;
        }
      }
    }
     System.out.println("sorted array:");
     for(int i=0;i<5;i++)
         System.out.println(""+arr[i]+"");
  }
}

/*
OUTPUT:
java sort 4 5 21 8 3
The array is:
sorted array:
3
4
5
8
21
*/
