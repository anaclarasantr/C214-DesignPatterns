package ordenacao.ordena.impl;

import ordenacao.Ordenacao;

public class BubbleSort implements Ordenacao {
    @Override
    public int[] Ordenar(int vet[]) {
        long inicio = System.currentTimeMillis();
        for (int i = vet.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vet[j - 1] > vet[j]) {
                    int aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        long tempoTotal = fim - inicio;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempoTotal + "ms");
        return vet;
    }
}

