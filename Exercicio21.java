import java.util.Collections;
import java.util.PriorityQueue;

public class Exercicio21 {

    private PriorityQueue<Integer> maxHeapMetadeInferior;
    private PriorityQueue<Integer> minHeapMetadeSuperior;

    public Exercicio21() {
        maxHeapMetadeInferior = new PriorityQueue<>(Collections.reverseOrder());
        minHeapMetadeSuperior = new PriorityQueue<>();
    }

    public void addNum(int num) {
        maxHeapMetadeInferior.add(num);
        minHeapMetadeSuperior.add(maxHeapMetadeInferior.poll());

        if (maxHeapMetadeInferior.size() < minHeapMetadeSuperior.size()) {
            maxHeapMetadeInferior.add(minHeapMetadeSuperior.poll());
        }
    }

    public double findMedian() {
        if (maxHeapMetadeInferior.size() == minHeapMetadeSuperior.size()) {
            return (maxHeapMetadeInferior.peek() + minHeapMetadeSuperior.peek()) / 2.0;
        } else {
            return maxHeapMetadeInferior.peek();
        }
    }
}