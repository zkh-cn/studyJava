package Collection;

import java.util.*;


public class inputNba {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("qwe");
        name.add("asd");
        name.add("gg");
        name.add("321");

//        for (int i = 0; i < name.size(); i++) {
//            System.out.println(name.get(i));
//        }

        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
