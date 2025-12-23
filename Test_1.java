import java.util.Scanner;

public class Test_1 {
    int x;
    int y;

    Test_1(){ //default constructor
        System.out.println("Default Constructor Called");
    }

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y: ");
        x=sc.nextInt();
        y=sc.nextInt();
    }

    void display(){
        System.out.println("X : "+x+" Y :"+y);
    }

    public static void main(String[] args) {
        Test_1 obj1 = new Test_1();
        Test_1 obj2 = new Test_1();

        obj1.input();
        obj1.display();
        obj2.input();
        obj2.display();
    }
}
