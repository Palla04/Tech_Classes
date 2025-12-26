import java.util.Scanner;

public class Test_3 {
    int x;
    int y;

    Test_3(){ // Default Constructor
        System.out.println("Default Constructor is called");
    }
    Test_3(int a){ //Parameterized Constructor (1 parameter)
        System.out.println("Parameterized constructor is called (1 parameter)");
        x = a;
        System.out.println("X : "+x+" Y : "+y);
    }

    Test_3(int a, int b){ //Parameterized Constructor (2 parameters)
        System.out.println("Parameterized constructor is called (2 parameters)");
        x = a;
        y = b;
        System.out.println("X : "+x+" Y : "+y);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void display(){
        System.out.println("Value of X is : "+x+" value of Y is : "+y);
    }
    public static void main(String[] args) {
        Test_3 obj1 = new Test_3();
        Test_3 obj2 = new Test_3(10, 20);
        Test_3 obj3 = new Test_3(111);

        // obj1.input();
        obj1.display();

        // obj2.input();
        obj2.display();

        obj3.display();
    }
}
