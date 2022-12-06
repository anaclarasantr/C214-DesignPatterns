import org.junit.Test;
import static org.junit.Assert.*;

public class testeApp {

    //Teste feliz

    @Test
    public void testeBuscaRenzo(){

        servico servico = new testeMock();
        app app = new app(servico);

        prof Renzo = app.buscaProf(1);

        assertEquals("Renzo", Renzo.getNome());
        assertEquals(13, Renzo.getHorarioAtendimento());
        assertEquals("integral", Renzo.getPeriodo());
    }

    @Test
    public void testeBuscaChristopher(){

        servico servico = new testeMock();
        app app = new app(servico);

        prof Christopher = app.buscaProf(2);

        assertEquals("Christopher", Christopher.getNome());
        assertEquals(15, Christopher.getHorarioAtendimento());
        assertEquals("integral", Christopher.getPeriodo());
    }

    @Test
    public void testeBuscaMarcelo(){

        servico servico = new testeMock();
        app app = new app(servico); //Instanciando Classe e passando o parametro que

        prof Marcelo = app.buscaProf(3);

        assertEquals("Marcelo", Marcelo.getNome());
        assertEquals(20, Marcelo.getHorarioAtendimento());
        assertEquals("noturno", Marcelo.getPeriodo());
    }


    //Teste triste

    @Test
    public void testeErroNome(){

        servico servico = new testeMock();
        app app = new app(servico);

        prof erroNome = app.buscaProf(4);

        assertNotEquals("Christopher", erroNome.getNome());
        assertEquals(15, erroNome.getHorarioAtendimento());
        assertEquals("integral", erroNome.getPeriodo());
    }

    @Test
    public void testeErroHorario(){

        servico servico = new testeMock();
        app app = new app(servico);

        prof erroHorario = app.buscaProf(5);

        assertEquals("Christopher", erroHorario.getNome());
        assertNotEquals(19, erroHorario.getHorarioAtendimento());
        assertEquals("integral", erroHorario.getPeriodo());
    }

    @Test
    public void testeErroPeriodo(){

        servico service = new testeMock();
        app app = new app(service);

        prof erroPeriodo = app.buscaProf(6);

        assertEquals("Marcelo", erroPeriodo.getNome());
        assertEquals(15, erroPeriodo.getHorarioAtendimento());
        assertNotEquals("noturno", erroPeriodo.getPeriodo());
    }

}
