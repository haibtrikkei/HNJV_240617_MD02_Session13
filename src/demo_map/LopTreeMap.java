package demo_map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LopTreeMap {
    public static void main(String[] args) {
        SortedMap<String, Student> listS = new TreeMap<>();

        listS.put("s01",new Student("s01","Nguyen Van Binh","Java"));
        listS.put("s02",new Student("s02","Pham Van Cuong","Java"));
        listS.put("s03",new Student("s03","Nguyen Van Bach","C#"));

        System.out.println("Thong tin sinh vien: ");
        for(Map.Entry<String,Student> s : listS.entrySet()){
            System.out.println(s);
        }
    }
}
