package day1;

public class ControlStatements {
    public static void main(String[] args) {

//  If Else statements & Switch statements

//        1st program -   ( Write a program to print on the basis of age ,
//        “Eligible for vote” or “Not eligible for vote” )

        int a= 2;
        int b= 25;
        int c= 35;


        if (a>=18)
        {
            System.out.println("Eligible for vote");
            System.out.println("Eligible for vote 2");
        }
        else
        {
            System.out.println("Not Eligible for vote");
        }
//         2nd program -   ( Write a program to print what is greater out of a & b )

        if (b>c)
            System.out.println("B is greater");
        else
            System.out.println("c is greater");
//        3rd program -   ( Write a program to print weekdays by number )

//        if (a==1)
//            System.out.println("Sunday");
//        else if (a==2)
//            System.out.println("Monday");
//        else if (a==3)
//            System.out.println("Tuesday");
//        else
//            System.out.println("Not a weekday");


        switch (a) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            default: System.out.println("no week day"); break;
        }




    }
}
