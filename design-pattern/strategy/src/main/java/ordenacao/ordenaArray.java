package ordenacao;

public abstract class ordenaArray {

    //Instância da Ordenação
    protected Ordenacao ordenacao;

    public int[] Ordenar(int vet[])
    {
        return ordenacao.Ordenar(vet);
    }

    //Getters e Setters
    public Ordenacao getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }
}
