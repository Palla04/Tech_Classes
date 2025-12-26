public class Test_4 {
    int x;
    int y;

    Test_4(){ // Default Constructor
        System.out.println("Default Constructor is called");
    }

    Test_4(int a){ //Parameterized Constructor (1 parameter)
        System.out.println("Parameterized constructor is called (1 parameter)");
        x = a;
    }

    Test_4(int a, int b){ //Parameterized Constructor (2 parameters)
        System.out.println("Parameterized constructor is called (2 parameters)");
        x = a;
        y = b;
    }

    Test_4(Test_4 obj){ //Copy Constructor
        System.out.println("Copy constructor is called");
        this.x = obj.x;
        this.y = obj.y;
    }
    void display(){
        System.out.println("Value of X is : "+x+" value of Y is : "+y);
    }

    public static void main(String[] args) {
        Test_4 obj1 = new Test_4();
        Test_4 obj2 = new Test_4(10, 20);
        Test_4 obj3 = new Test_4(111);
        Test_4 obj4 = new Test_4(obj2); // Using Copy Constructor

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}