package day12;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap hm1 = new HashMap();
        hm1.put(100, "apple");
        hm1.put(99, "ball");
        hm1.put(101, "cat");
        hm1.put("test", "dog");
        System.out.println(hm1);
//        hm1.remove(100);
//        System.out.println(hm1);
//
//        for (Map.Entry m: hm1.entrySet()){
//            System.out.println(m.getKey() + m.getValue());
//        }

    }
}
