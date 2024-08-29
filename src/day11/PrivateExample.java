package day11;


//public class test123 {
//    private int a = 1234;          // Private variables , methods can accessible only in same class
//    int b = 122;
//
//    private void m1() {
//        System.out.println("test data");
//    }
//}
class test124 {
    int c = 1234;
    void m2() {
        System.out.println("tes data");
    }
}
public class PrivateExample {

    public static void main(String[] args) {
//        test123 abc = new test123();
//        abc.b =44;

        test124 abc1 = new test124();
        abc1.m2();

    }
}
