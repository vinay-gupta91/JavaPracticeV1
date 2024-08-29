package day5;

public class OopsConstructor {

    int empid;
    String ename;
    String dept;

    OopsConstructor(int id, String name, String dep)
    {
        empid = id;
        ename = name;
        dept = dep;
    }
    void displays()
    {
        System.out.println(empid);
        System.out.println(ename);
        System.out.println(dept);
    }
}
