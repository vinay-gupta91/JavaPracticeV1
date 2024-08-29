package day11;

public class ExceptionalExample {
    public static void main(String[] args) {
        System.out.println("program startsss");
        String a = "456efr";
        int x = 0;
        try {
            x = Integer.parseInt(a);
        }
        catch (NumberFormatException abc){
            System.out.println("catchheed2");
        }
        int  y = 30;

//        try {
//            System.out.println(y/0);
//        }
//        catch (ArithmeticException ab){
//            System.out.println("cATCHED");
//        }
        System.out.println("program endsssss");
    }
}
