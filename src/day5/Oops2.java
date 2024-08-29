package day5;

public class Oops2 {

    int empid;
    String ename;
    String dept;

    void employee(int id, String name, String dep)
    {
        empid = id;
        ename = name;
        dept = dep;

    }

    void display()
    {
        System.out.println(empid);
        System.out.println(ename);
        System.out.println(dept);
    }
}
