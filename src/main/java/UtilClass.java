import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilClass {
    public static void main(String args[]) throws IOException {
        Car car1 = new Car("Dacia", 2015);
        Car car2 = new Car("Audi", 2006);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("C:\\Users\\cti22c110\\Downloads\\asd\\car.json"), car1);
        objectMapper.writeValue(new File("C:\\Users\\cti22c110\\Downloads\\asd\\car.json"), car2);
    }
}
