package day9;

class SBI extends MethodOverriding1{    /* example of Method override   */
    double y;
    double BankInterest( ) {
        return y+x;
    }
}
class ICICI extends MethodOverriding1{     /* example of Heirarchy Inheritance   */
    double z;
    double iciciInterest(){
        return (z);
    }
}
class KOTAK extends MethodOverriding1{
    double a;
    double kotakInterest(){
        return (a);
    }
}


public class MethodOverriding2 {
    public static void main(String[] args) {

        ICICI heirarchy1 = new ICICI();
        heirarchy1.x= 10;
        heirarchy1.z= 20;
        System.out.println(heirarchy1.BankInterest());
        System.out.println(heirarchy1.iciciInterest());




        SBI OverRideobj = new SBI();
        OverRideobj.x= 40.22222;
        OverRideobj.y = 50.333333;
        System.out.println(OverRideobj.BankInterest());

    }
}
