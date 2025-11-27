import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercicio18 {

    static class Elemento implements Comparable<Elemento> {
        int valor;
        int listaIndex;
        int elementoIndex;

        public Elemento(int valor, int listaIndex, int elementoIndex) {
            this.valor = valor;
            this.listaIndex = listaIndex;
            this.elementoIndex = elementoIndex;
        }

        @Override
        public int compareTo(Elemento outro) {
            return Integer.compare(this.valor, outro.valor);
        }
    }

    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        List<Integer> resultado = new ArrayList<>();
        PriorityQueue<Elemento> minHeap = new PriorityQueue<>();

        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null && !lists.get(i).isEmpty()) {
                minHeap.add(new Elemento(lists.get(i).get(0), i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            Elemento atual = minHeap.poll();
            resultado.add(atual.valor);

            int proxIndex = atual.elementoIndex + 1;
            if (proxIndex < lists.get(atual.listaIndex).size()) {
                int proxValor = lists.get(atual.listaIndex).get(proxIndex);
                minHeap.add(new Elemento(proxValor, atual.listaIndex, proxIndex));
            }
        }
        return resultado;
    }
}