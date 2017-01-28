import java.util.List;
import java.util.Map;

public class Document {
    List<Map<String, Property>> properties;

    public List<Map<String, Property>> getProperties() {
        return properties;
    }

    public void setProperties(List<Map<String, Property>> properties) {
        this.properties = properties;
    }
}
