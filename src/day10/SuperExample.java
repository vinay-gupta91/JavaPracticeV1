package day10;


class Super1{
    int a =10;
    void m1(){
        System.out.println(a);
    }
}

class Super2 extends Super1 {
    int b = 20;
    void m1() {
        System.out.println(b);
        System.out.println(a);
    }
}
public class SuperExample extends Super2{
    int c = 30;

    void m3() {
        System.out.println(c);
        super.m1();
    }

}
