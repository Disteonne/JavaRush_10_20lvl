package level11;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] data = new int[]{5, 9, 13, -31, 6, -131, 1, 0, 64};
        Pair<Integer, Integer> result = getMinMax(data);
        System.out.println(result.x);
        System.out.println(result.y);
    }

    public static Pair<Integer, Integer> getMinMax(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
        Arrays.sort(arr);
        int x = arr[0];
        int y = arr[arr.length - 1];
        return new Pair<Integer, Integer>(x, y);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}


