import java.util.Scanner;
public class setA4
{
        public staitc void main(Sting[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of elements :");
            int n=sc.nextInt();
            int[] array=new int[n];
            System.out.println("Enter the array element:");
            for(int i=0;i<n;i++)
            {
             array[i]=sc.nextInt();
            }
            System.out.println("reverse order is:");
            for(int i=n-1;i>=0;i--)
            {
             System.out.println(array[i]);
            }
            sc.close();
          
        }
}
           