package day8;

public class Static2 {

//    void testwaste(){      // This way is wrong , not call method of one class in another class method , only done by main method
//        System.out.println(Static1.a);
//        System.out.println(Static1.b);
//        Static1.m1();
//        Static1.m2();
//    }

    public static void main(String[] args) {
        System.out.println(Static1.a);
        Static1.m2();

        Static1 aaa = new Static1();
        System.out.println(aaa.b);
        aaa.m1();
    }

}
