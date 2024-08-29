package day7;

public class ThisKeyword {
    int a;
    int b;
    void getvalue(int a , int c){

        this.a = a;
        this.b = c;
    }

    void display() {
        System.out.println(a+b);
    }

}
