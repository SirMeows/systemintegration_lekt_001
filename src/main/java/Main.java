import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DataParser dataParser = new DataParser();
        try {
            dataParser.parseXML("src/main/resources/me.xml");
            dataParser.parseJSON("me.json");
            dataParser.parseYAML("me.yaml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
