public class testeMock implements servico {

    @Override
    public String busca(int id) { //Simula os números do servidor

        if (id == 1) {
            return profConst.Renzo;
        }
        if (id == 2) {
            return profConst.Christopher;
        }
        if (id == 3) {
            return profConst.Marcelo;
        }

        if (id == 4) {
            return profConst.erroNome;
        }
        if (id == 5) {
            return profConst.erroHorario;
        }
        if (id == 6) {
            return profConst.erroPeriodo;
        }
        return null;
    }
}