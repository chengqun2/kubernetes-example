import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        Map map = new HashMap();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Map> list = getList();
                map.put("list",list);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int total = getTotal();
                map.put("total",total);
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(map);
    }

    private static Integer getTotal() {
        return 10;
    }

    private static List<Map> getList() {
        List<Map> list1 = new ArrayList<>();
        Map map1 = new HashMap();
        map1.put("id","1");
        map1.put("name","c11");
        list1.add(map1);
        Map map2 = new HashMap();
        map2.put("id","2");
        map2.put("name","c22");
        list1.add(map2);
        return list1;
    }
}
