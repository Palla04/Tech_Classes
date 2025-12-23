import java.util.Scanner;

public class Test_2 {
    int x;
    int y;

    Test_2(int x){ //parameterized constructor
        System.out.println("Parameterized Constructor Called");
        System.out.println("Value of x is: " + x);
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y: ");
        this.x=sc.nextInt();
        this.y=sc.nextInt();
    }

    void display(){
        System.out.println("X : "+x+" Y :"+y);
    }

    public static void main(String[] args) {
        Test_2 obj1 = new Test_2(10);

        obj1.input();
        obj1.display();
    }
}
