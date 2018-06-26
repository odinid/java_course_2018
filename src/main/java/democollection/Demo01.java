package democollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        //demo01.demoList();
        //demo01.demoMap();
        demo01.demoSet();
    }
    
    private void demoSet() {
        Set<String> names = new HashSet<>();
        
        names.add("Name1");
        names.add("Name2");
        names.add("Name0");
        
        for (String name : names) {
            System.out.println(name);
        }

    }
    
    private void demoMap() {
        Map<String, Integer> names = new HashMap<>();
        
        names.put("Name1", 20);
        names.put("Name2", 30);
        names.put("Name2", 40);
        names.put("Name0", 20);
        Set<String> keys = names.keySet();
        
        for (String key : keys) {
            System.out.println(key + " = " + names.get(key));
        }
        System.out.println("");
        for (Map.Entry<String, Integer> name : names.entrySet()) {
            System.out.println(name.getKey() + " = " + name.getValue());
        }
    }
    
    private void demoList() {
        System.out.println("Call demoList");
        // Generic
        List<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
