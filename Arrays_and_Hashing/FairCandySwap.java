import java.util.HashSet;
import java.util.Set;
public class FairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        Set<Integer> setB = new HashSet<>();
        for (int x : aliceSizes) sumA += x;
        for (int x : bobSizes) { sumB += x; setB.add(x); }
        int delta = (sumB - sumA) / 2;
        for (int x : aliceSizes) {
            if (setB.contains(x + delta)) {
                return new int[]{x, x + delta};
            }
        }
        return new int[0];
    }
}
