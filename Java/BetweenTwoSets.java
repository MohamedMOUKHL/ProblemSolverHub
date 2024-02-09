import java.util.List;
import java.util.ArrayList;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int len_a = a.size();
        int len_b = b.size();
        int numBetween = 0;
        for (int i = 1; i <= 100; i++) {
            boolean isFactor = true;
            for (int j = 0; j < len_a; j++) {
                if (i % a.get(j) != 0) {
                    isFactor = false;
                    break;
                }
            }
            if (isFactor) {
                for (int k = 0; k < len_b; k++) {
                    if (b.get(k) % i != 0) {
                        isFactor = false;
                        break;
                    }
                }
            }
            if (isFactor) {
                numBetween++;
            }
        }
        return numBetween;
    }

    public static void main(String[] args) {
        int res = getTotalX(List.of(2, 4), List.of(16, 32, 96));
        System.out.println(res);
    }
}

