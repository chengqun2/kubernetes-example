import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) {
        Map map = new HashMap();
        CompletableFuture<Void> f1 = CompletableFuture.runAsync(()-> {
            List<Map> list = getList();
            map.put("list",list);
        });
        CompletableFuture<Void> f2 = CompletableFuture.runAsync((() -> {
            int total = getTotal();
            map.put("total",total);
        }));
        CompletableFuture<Void> all = CompletableFuture.allOf(f1, f2);
        all.join();
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
