package QuesAns;

public class Calculator {
    void sum(int a , int b){
        System.out.println(a+b);
    }

    void sum(int a , double b, int fh){
        System.out.println(a+b+fh);
    }
    void sum(double a , int b){
        System.out.println(a+b);
    }
    void sum(double a , double b){
        System.out.println(a+b);
    }
}

class Calculator2 extends Calculator{
    void subtract(int a , int b){
        System.out.println(a-b);
    }

    void subtract(int a , double b){
        System.out.println(a-b);
    }
    void subtract(double a , int b){
        System.out.println(a-b);
    }
    void subtract(double a , double b){
        System.out.println(a-b);
    }
}


class Calculator3 extends Calculator2 {
    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void multiply(int a, double b) {
        System.out.println(a * b);
    }

    void multiply(double a, int b) {
        System.out.println(a * b);
    }

    void multiply(double a, double b) {
        System.out.println(a * b);
    }

}