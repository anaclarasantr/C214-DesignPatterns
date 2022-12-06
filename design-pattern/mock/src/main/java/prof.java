public class prof {

    private String nome;
    private int horarioAtendimento;
    private String periodo;


    //Construtor
    public prof(String nome, int horarioAtendimento, String periodo) {
        this.nome = nome;
        this.horarioAtendimento = horarioAtendimento;
        this.periodo = periodo;
    }


    //Getters
    public String getNome() {
        return nome;
    }

    public int getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }


    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorarioAtendimento(int horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
