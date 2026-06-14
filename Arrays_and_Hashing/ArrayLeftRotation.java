import java.util.List;
import java.util.ArrayList;
public class ArrayLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int n = a.size();
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(a.get((i + d) % n));
        }
        return result;
    }
}
