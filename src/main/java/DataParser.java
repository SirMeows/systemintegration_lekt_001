import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class DataParser {

    public void parseXML(String filePath) throws IOException {
        var xmlMapper = new XmlMapper();
        var person = xmlMapper.readValue(new File(filePath), Person.class);
        System.out.println(person);
    }

    public void parseJSON(String filePath) {
        // Implementation
    }

    public void parseYAML(String filepath) {

    }
}





