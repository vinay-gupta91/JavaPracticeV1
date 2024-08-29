package day3;

public class JavaArrays {

    public static void main(String[] args) {
//
//        int a[]= new int[7];
//        a[0]= 100;
//        a[1]= 200;
//        System.out.println("length of an array a: " +a.length);
//        System.out.println(a[1]);

        int a[]= new int[4];

        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        System.out.println(a[2]);
        System.out.println(a.length);
        System.out.println(a);

        int b[]= { 10, 20 , 30 , 40};
        System.out.println(b[2]);
        System.out.println(b.length);

        int c[][]= new int[3][2];
        c[0][0] = 1000;
        c[0][1] = 2000;
        c[1][0] = 3000;
        c[1][1] = 4000;
        System.out.println(c);
        System.out.println(c[0][1]);
        System.out.println(c[0].length);

        int ca[] = {10, 20, 30, 40, 50, 60, 90};
        System.out.println("length of an array a: " +ca.length);
        System.out.println(ca[3]);



//        for(int i = 0; i<=b.length-1;i++)
//            System.out.println(b[i]);

        for(int i:ca)
            System.out.println(i);




    }
}
