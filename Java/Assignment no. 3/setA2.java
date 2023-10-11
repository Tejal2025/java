import java.io.*;
import java.util.*;

abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String deptName;

    OfficeStaff(int id, String name, String deptName) {
        super(id, name);
        this.deptName = deptName;
    }

    static void display(int n, OfficeStaff pl[]) {
        System.out.print("\nid\tname\tdeptName");
        for (int i = 0; i < n; i++) 
            System.out.print("\n" + pl[i].id + "\t" + pl[i].name + "\t" + pl[i].deptName);
    }
}

class MK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of office staff: ");
        int n = sc.nextInt();
        OfficeStaff pl[] = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int r = sc.nextInt();
            System.out.print("Enter name: ");
            String nm = sc.next();
            System.out.print("Enter dept name: ");
            String dn = sc.next();

            pl[i] = new OfficeStaff(r, nm, dn);
        }
        OfficeStaff.display(n, pl);
    }
}

/*
OUTPUT:-

ty8@pc40:~/Ty 8/Java/Assignment no. 3$ javac setA2.java
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ java MK

Enter the number of office staff: 2
Enter id: 123
Enter name: Tejal
Enter dept name: Bsc
Enter id: 456
Enter name: Sanchi
Enter dept name: Comp

id	name	deptName
123	Tejal	Bsc
456	Sanchi	Comp

*/
