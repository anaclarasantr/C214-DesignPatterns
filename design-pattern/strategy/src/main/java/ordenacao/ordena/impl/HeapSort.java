package ordenacao.ordena.impl;

import br.inatel.cdg.ordenacao.Ordenacao;

public class HeapSort implements Ordenacao {
    @Override
    public int[] Ordenar(int[] vet) {
        buildMaxHeap(vet);
        int tamVet = vet.length;

        for (int i = vet.length - 1; i > 0; i--) {
            swap(vet, i, 0);
            maxHeapify(vet, 0, --tamVet);
        }
        return vet;
    }

    private static void buildMaxHeap(int[] vet) {
        for (int i = vet.length/(2-1); i >= 0; i--)
        {
            maxHeapify(vet, i, vet.length);
        }
    }

    private static void maxHeapify(int[] vet, int pos, int tamVetor) {

        int max = 2 * pos + 1, right = max + 1;
        if (max < tamVetor) {

            if (right < tamVetor && vet[max] < vet[right]) {
                max = right;
            }

            if (vet[max] > vet[pos]) {
                swap(vet, max, pos);
                maxHeapify(vet, max, tamVetor);
            }
        }
    }

    public static void swap(int[] vet, int j, int aposJ) {
        int aux = vet[j];
        vet[j] = vet[aposJ];
        vet[aposJ] = aux;
    }
}
