package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        //setDemo();
        mapDemo();
    }

    private static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 13);
        fruitCalories.put("banana", 141);
        fruitCalories.put("orange", 55);

        for(var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    private static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("banana");

        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        fruit.forEach(System.out::println);
    }
}
