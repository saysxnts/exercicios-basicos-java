import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Exercicio19 {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private Map<Integer, Integer> contagem;
    private int tamanhoReal;

    public Exercicio19() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        contagem = new HashMap<>();
        tamanhoReal = 0;
    }

    public void insert(int value) {
        minHeap.add(value);
        maxHeap.add(value);
        contagem.put(value, contagem.getOrDefault(value, 0) + 1);
        tamanhoReal++;
    }

    private void limparTopo(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty() && contagem.getOrDefault(heap.peek(), 0) == 0) {
            heap.poll();
        }
    }

    public int getMax() {
        limparTopo(maxHeap);
        if (maxHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        return maxHeap.peek();
    }

    public int getMin() {
        limparTopo(minHeap);
        if (minHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        return minHeap.peek();
    }

    public int removeMax() {
        int max = getMax();
        maxHeap.poll();
        removerDoMapa(max);
        return max;
    }

    public int removeMin() {
        int min = getMin();
        minHeap.poll();
        removerDoMapa(min);
        return min;
    }

    private void removerDoMapa(int val) {
        contagem.put(val, contagem.get(val) - 1);
        if (contagem.get(val) == 0) {
            contagem.remove(val);
        }
        tamanhoReal--;
    }

    public boolean isEmpty() {
        return tamanhoReal == 0;
    }
}