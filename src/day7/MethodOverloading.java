package day7;

public class MethodOverloading {

    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, double b){
        System.out.println(a+b);
    }

    void sum(double a, double b){
        System.out.println(a+b);
    }

    void sum(double a, int b){
        System.out.println(a+b);
    }

}
