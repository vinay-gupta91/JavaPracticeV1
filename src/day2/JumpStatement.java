package day2;

public class JumpStatement {
    public static void main(String[] args) {

        for(int b=1;b<=10;b++)
        {
            if (b==2 || b==4 || b==6)
            {
                continue;
            }
            System.out.println(b);
        }


    }
}
