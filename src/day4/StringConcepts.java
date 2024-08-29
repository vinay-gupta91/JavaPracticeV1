package day4;

public class StringConcepts {
    public static void main(String[] args) {

        String a= "welcome";
        String b= " to home honey";

        System.out.println(a.length());  //7
        System.out.println(a.toUpperCase().concat(b.toLowerCase()));  // joined sentence
        System.out.println(b.trim());
        System.out.println(a.equals("welcome"));  //true
        System.out.println(a.equalsIgnoreCase("wELcome")); //true
        System.out.println(b.replace('e', 's'));
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(2));
        System.out.println(a.contains("com"));

        int rat[] =new int[3];
        rat[0]= 10;
        rat[1]= 20;
        rat[2]= 30;
        System.out.println(rat[0]);

    }
}
