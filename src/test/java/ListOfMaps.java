import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

public class ListOfMaps {
    @Test
    public void listOfMapTest(){
        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("src/test/resources/listOfMaps.yml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Document document = yaml.loadAs(inputStream, Document.class);

        List<Map<String, Property>> properties = document.getProperties();
        Map<String, Property> propertyMap = properties.get(0);

        System.err.print(propertyMap.get("property1"));

        assert(propertyMap.get("property1") instanceof Property);
    }

    @Test
    public void mapTest(){
        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("src/test/resources/Map.yml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        SimpleDocument simpleDocument = yaml.loadAs(inputStream, SimpleDocument.class);

        Map<String, Property> properties = simpleDocument.getProperties();

        assert(properties.get("property1") instanceof Property);
    }
}
