package demo_map;

import java.util.Hashtable;
import java.util.Map;

public class LopHashTable {
    public static void main(String[] args) {
        Map<String,String> list = new Hashtable<>();

        list.put("1","One");
        list.put("2","Two");
        list.put("3","Three");
        list.put("4","Four");
        list.put("5","Five");
        list.put("0","Zero");

        for(Map.Entry<String,String> obj : list.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }
    }
}
