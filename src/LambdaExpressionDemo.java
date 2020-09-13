import java.util.HashMap;
import java.util.Map;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Map<Integer ,Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(2, 2);
        comapareEquality(map, (i, j) -> i == j );
    }

    public static void comapareEquality (Map<Integer, Integer> map, NumberComparator comparator) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (comparator.compare (entry.getKey(), entry.getValue() )) {
                System.out.println(entry);
            }
        }
    }
}


