package Tree.FindKClosestElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// solution-2 MinHeap
public class Solution2 {
    //inner class
    class Item implements Comparable<Item> {
        //fields
        int value;
        int target;
        int diffVal;

        // constructor
        public Item(int value, int target) {
            this.value = value;
            this.target = target;
            this.diffVal = Math.abs(target - value);
        }

        @Override
        public int compareTo(Item other) {

            if (this.diffVal != other.diffVal) {
                return this.diffVal - other.diffVal;
            }

            return this.value - other.value;
        }
    }
    /**
     * @param A:      an integer array
     * @param target: An integer
     * @param k:      An integer
     * @return: an integer array
     */
    public int[] kClosestNumbers(int[] A, int target, int k) {

        int[] defaultValue = new int[0];

        if (A == null || A.length == 0) {
            return defaultValue;
        }

        int size = A.length;

        if (k <= 0) {
            return defaultValue;
        }

        if (k > size) {
            return A;
        }

        k = (k > size) ? size : k;

        Queue<Item> minHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        for (int a : A) {
            minHeap.offer(new Item(a, target));

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        Arrays.fill(result, 0);

        int index = k - 1;

        while (!minHeap.isEmpty()) {
            Item item = minHeap.poll();
            result[index--] = item.value;
        }

        return result;
    }
}
