package ordenacao;

public class ordenacaoMain {

    public static void main(String[] args)
    {
        int vet[] = new int[6];
        int array[] = new int[6];

        vet[0] = 0;
        vet[1] = 1;
        vet[2] = 2;
        vet[3] = 3;
        vet[4] = 4;
        vet[5] = 5;

        bubbleSort BS = new bubbleSort();
        //array = BS.Ordenar(vet);

        mergeSort MS = new mergeSort();
        //array = MS.Ordenar(vet);

        heapSort HS = new heapSort();
        array = HS.Ordenar(vet);

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
