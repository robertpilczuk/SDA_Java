package serialization;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SerializerRunner {
    public static void main(String[] args) {

        ToSerialize serialize = new ToSerialize("Maciej"
                , "Brzozowski"
                , 18);

        System.out.println(serialize);

        String pseudoFile = serialize.toString()
                .replace("18", "19");

        System.out.println(new Gson().toJson(serialize));

        String myJson = "{\"firstName\":\"Eustachy\", \"lastName\":\"Motyka\", \"age\":22}";

        ToSerialize myDeserialized = new Gson().fromJson(myJson, ToSerialize.class);

        System.out.println(myDeserialized);

        String response = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"delectus aut autem\",\n" +
                "  \"completed\": false\n" +
                "}";

        Response resp = new Gson().fromJson(response,Response.class);
        System.out.println(resp);

        MyObject myObject = new MyObject();
        myObject.setHaLong(22L);
        myObject.setName("Very long name");
        myObject.setNumbers(new int[]{1,3,4,5,67,88});
        myObject.setSerializes(new ToSerialize[]{new ToSerialize("John","Doe",99)
        , new ToSerialize("Adam","Słodowy",66)});

        System.out.println(new Gson().toJson(myObject));

        String asd = "";
        try {
         asd = Unirest.get("https://jsonplaceholder.typicode.com/todos/1").asString().getBody();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        System.out.println(asd);
    }
}
