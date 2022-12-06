package br.inatel.cdg.teste.ordenacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import br.inatel.cdg.ordenacao.bubbleSort;
import br.inatel.cdg.ordenacao.heapSort;
import br.inatel.cdg.ordenacao.mergeSort;
import br.inatel.cdg.ordenacao.ordena.impl.BubbleSort;
import br.inatel.cdg.ordenacao.ordena.impl.HeapSort;
import br.inatel.cdg.ordenacao.ordena.impl.MergeSort;
import org.junit.Before;
import org.junit.Test;

public class testOrdenaArray {

    int[] vetorMockado = new int[6];

    @Before
    public void mock(){
        vetorMockado[0] = 0;
        vetorMockado[1] = 1;
        vetorMockado[2] = 2;
        vetorMockado[3] = 3;
        vetorMockado[4] = 4;
        vetorMockado[5] = 5;
    }

    @Test
    public void testeBubbleSort() {
        bubbleSort BS = new bubbleSort();
        int vet[] = new int[6];
        vet = BS.Ordenar(vetorMockado);
        assertNotEquals(vet[0], 5);
        assertEquals(vet[1], 1);
        assertEquals(vet[2], 2);
        assertNotEquals(vet[3], 0);
        assertEquals(vet[4], 4);
        assertNotEquals(vet[5], 4);
    }

    @Test
    public void testeMergeSort() {
        mergeSort MS = new mergeSort();
        int vet[] = new int[6];
        vet = MS.Ordenar(vetorMockado);
        assertNotEquals(vet[0], 5);
        assertNotEquals(vet[1], 4);
        assertNotEquals(vet[2], 3);
        assertNotEquals(vet[3], 2);
        assertNotEquals(vet[4], 1);
        assertNotEquals(vet[5], 0);
    }

    @Test
    public void testeHeapSort() {
        heapSort HS = new heapSort();
        int vet[] = new int[6];
        vet = HS.Ordenar(vetorMockado);
        assertEquals(vet[0], 0);
        assertEquals(vet[1], 1);
        assertEquals(vet[2], 2);
        assertEquals(vet[3], 3);
        assertEquals(vet[4], 4);
        assertEquals(vet[5], 5);
    }

    @Test
    public void testBubbleSort() {
        bubbleSort ordenacaoBS = new bubbleSort();
        assertTrue(ordenacaoBS.getOrdenacao() instanceof BubbleSort);
    }

    @Test
    public void testMergeSort() {
        mergeSort ordenacaoMS = new mergeSort();
        assertTrue(ordenacaoMS.getOrdenacao() instanceof MergeSort);
    }


    @Test
    public void testHeapSort() {
        heapSort ordenacaoHS = new heapSort();
        assertTrue(ordenacaoHS.getOrdenacao() instanceof HeapSort);
    }

}
