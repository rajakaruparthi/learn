import java.util.HashMap;
import java.util.Map;

public class TestingHAshmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("raja", "1");
        map.put("pat", "2");

        String raja = map.remove("raja");
        System.out.println(raja);
        System.out.println(map);
    }
}

