package day8;

public class EployeeStatic2 {
    public static void main(String[] args) {

        EployeeStatic emp = new EployeeStatic();
        emp.emp_name = "vinay";
        emp.dep_name = " Engineering";
        emp.dep_id =  10;
//        or
//        EployeeStatic.dep_id = 10;
        emp.emp_id =  1;
        emp.display_emp();

        EployeeStatic emp2 = new EployeeStatic();
        emp2.display_emp();
    }
}
