import java.io.*;
import java.util.*;

interface Products {
}

class Product implements Products {
    int id, quantity, cost;
    String name;
    public static int objectCount = 0;

    Product() {
        id = 0;
        name = null;
        quantity = 0;
        cost = 0;
    }

    Product(int id, String name, int quantity, int cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        objectCount++;
    }

    public void display() {
        System.out.print("\n" + id + "\t" + name + "\t" + quantity + "\t\t" + cost);
    }
}

class MK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of products: ");
        int n = sc.nextInt();
        Product[] pr = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter product id: ");
            int r = sc.nextInt();
            System.out.print("Enter product name: ");
            String nm = sc.next();
            System.out.print("Enter product quantity: ");
            int q = sc.nextInt();
            System.out.print("Enter product cost: ");
            int c = sc.nextInt();

            pr[i] = new Product(r, nm, q, c);
        }

        System.out.print("\npr_id\tpr_name\tpr_quantity\tpr_cost");
        for (int i = 0; i < n; i++)
            pr[i].display();
        
        System.out.print("\n\nObject count: " + Product.objectCount);
    }
}

/*
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ javac setB2.java
ty8@pc40:~/Ty 8/Java/Assignment no. 3$ java MK

Enter the number of products: 2

Enter product id: 1
Enter product name: Lipstick  
Enter product quantity: 10
Enter product cost: 450

Enter product id: 2
Enter product name: Sunscreen
Enter product quantity: 50
Enter product cost: 700

pr_id	pr_name	   pr_quantity	pr_cost
1	Lipstick   10      	450
2	Sunscreen  50		700

Object count: 2
*/

