import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratorTest {

    public static void main(String[] args) {
        List<Map> list1 = new ArrayList<>();

        Map map1 = new HashMap();
        map1.put("id","1");
        map1.put("name","c11");
        list1.add(map1);
        Map map2 = new HashMap();
        map2.put("id","2");
        map2.put("name","c22");
        list1.add(map2);

        List<Map> list2 = new ArrayList<>();
        Map map11 = new HashMap();
        map11.put("id","1");
        map11.put("img","img11");
        list2.add(map11);
        Map map22 = new HashMap();
        map22.put("id","2");
        map22.put("img","img22");
        list2.add(map22);
        System.out.println(list1);
        System.out.println(list2);

        for (Map map : list1) {
            for (Map map222 : list2) {
                if (map.get("id").equals(map222.get("id"))){
                    System.out.println(map222.get("img"));
                    map.put("img",map222.get("img"));
                }
            }
        }
        System.out.println(list1);
    }
}
