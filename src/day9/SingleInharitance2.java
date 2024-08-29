package day9;

class SingleI extends SingleInharitance1{
    int y;
    void m2(){
        System.out.println(y);
    }
}

public class SingleInharitance2 {
    public static void main(String[] args) {

//        SingleI singleObj = new SingleI();
//        singleObj.x = 10;
//        singleObj.y = 20;
//        singleObj.m1();
//        singleObj.m2();

        multiLevel1 mlObj = new multiLevel1();
        mlObj.x= 10;
        mlObj.y= 20;
        mlObj.z= 30;
        mlObj.m1();
        mlObj.m2();




    }
}
