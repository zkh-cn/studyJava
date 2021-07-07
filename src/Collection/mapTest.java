package Collection;

import java.util.*;

public class mapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qwe","asd");
        map.put("qwe2","asd1");
        map.put("qwe4","asd8");
        Set<String> set = map.keySet();//key
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collection<String> values = map.values();//value
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
