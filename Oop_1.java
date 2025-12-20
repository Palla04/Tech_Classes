import java.util.Scanner;

public class Oop_1 {
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
    public static void main(String[] args) {
        Oop_1 obj = new Oop_1();
        obj.input();
        obj.display();
    }

}
