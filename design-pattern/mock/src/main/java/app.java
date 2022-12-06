import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class app {

    //Busca o professor
    servico servico;

    public app(servico servico){
        this.servico = servico;
    }

    public prof buscaProf(int id){

        String profJson = servico.busca(id);

        //Convertendo profJson para um JsonObject usando a dependência Gson
        JsonObject jsonObject = JsonParser.parseString(profJson).getAsJsonObject();

        return new prof(jsonObject.get("nomeProf").getAsString(),
                jsonObject.get("horarioAtendimento").getAsInt(),
                jsonObject.get("periodo").getAsString());
    }

}
