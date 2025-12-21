import java.util.Scanner;

public class Oop_2 {
    int x;
    int y;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y: ");
        x=sc.nextInt();
        y=sc.nextInt();
    }

    void display(){
        System.out.println("X : "+x+" Y :"+y);
    }
    
    protected void finalize(){
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        Oop_2 obj1 = new Oop_2();
        Oop_2 obj2 = new Oop_2();
        Oop_2 obj3 = new Oop_2();
        Oop_2 obj4 = new Oop_2();
        obj1.input();
        obj1.display();
        obj2.input();
        obj2.display();
        
        obj1 = null;
        obj3 = null;
        obj4 = null;
        System.gc();
    }
}
