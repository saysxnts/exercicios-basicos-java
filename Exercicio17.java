import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercicio17 {
    public static List<Integer> findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}