import java.io.*;
import java.util.*;

interface Cube {
    int calculate(int x);
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        // Lambda expression to define the calculate method
        Cube s = (int x) -> x * x * x;

        int ans = s.calculate(n);
        System.out.println("Cube of number:"+ans);
    }
}

/*
OUTPUT:-

ty8@pc40:~/Ty 8/Java/Assignment no. 3$ javac setA4.java
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ java Test

Enter number: 2
Cube of number:8
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ java Test

Enter number: 6
Cube of number:216
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ java Test

Enter number: 3
Cube of number:27

*/
