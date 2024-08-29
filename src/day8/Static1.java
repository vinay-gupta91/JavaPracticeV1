package day8;

public class Static1 {

    static int a = 100;
    int b = 200 ;

    void m1(){
        System.out.println(" non static stuff");
    }
    static void m2(){
        System.out.println("static stuff");
    }

    void testwaste11(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
}
