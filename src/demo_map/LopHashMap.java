package demo_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LopHashMap {
    public static void main(String[] args) {
        Map<Integer,String> list = new HashMap<>();

        list.put(1,"Cuong");
        list.put(2,"Mai");
        list.put(3,"Dao");
        list.put(4,"Tien");
        list.put(5,"Manh");
        list.put(6,"Duc");

        System.out.println("Duyệt theo key: ");
        Set<Integer> listKey = list.keySet();
        for(Integer key : listKey){
            System.out.println(key+" : "+list.get(key));
        }

        System.out.println("\nDuyet pho bien cua map: ");
        for(Map.Entry<Integer,String> obj : list.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }
    }
}
