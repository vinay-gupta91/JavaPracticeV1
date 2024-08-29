package day5;

public class OopsMain1 {

//    OOPS concept    -   main() method when present in separate  class.

    public static void main(String[] args) {
        Oops1 emp1 = new Oops1();
        emp1.dept = "engineering";
        emp1.empid = 1401;
        emp1.ename = "vinay gupta" ;
        emp1.employee();

        Oops1 emp2 = new Oops1();
        emp2.employee();


    }
}
