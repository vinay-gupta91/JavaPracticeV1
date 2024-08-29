package day3;

public class MulDimArrays {
    public static void main(String[] args) {

        int c[][]= new int[3][2];

        c[0][0]= 100;
        c[0][1]= 200;
        c[1][0]= 300;
        c[1][1]= 400;
        c[2][0]= 500;
        c[2][1]= 600;
        System.out.println("length of multi dim. array:  "+c[0].length);
        System.out.println(c[2][0]);

//        for(int i=0;i<a.length;i++)
//            for(int j=0;j<a[i].length;j++) {
//                System.out.println(a[i][j]);
//            }
        for(int i[]:c)
            for(int j:i) {
                System.out.println(j);
            }

    }
}
