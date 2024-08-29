package day8;

public class EployeeStatic {

    int emp_id;
    static int dep_id;
    String emp_name = "sunita";
    String dep_name ;

    void display_emp()
    {
        System.out.println("id = " + emp_id + ", dep no = "+ dep_id + ", name = "+ emp_name + ", Department = "+dep_name);
    }



}
