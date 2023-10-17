package utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private String propertiesName;
    private Properties properties = new Properties();

    public PropertiesReader(String propertiesName) {
        this.propertiesName = propertiesName;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try(InputStream inputStream = classloader.getResourceAsStream(propertiesName)){
            if(inputStream != null) {
                properties.load(inputStream);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public float getMaxWeight() {
        return Float.parseFloat(properties.getProperty("max_weight"));
    }

    public int getSpeed() {
        return Integer.parseInt(properties.getProperty("weight"));
    }

    public float getMaxSatiety() {
        return Float.parseFloat(properties.getProperty("satiety"));
    }

    public float getEatingProbabilityFor(String animal) {
        return Float.parseFloat(properties.getProperty(animal));
    }
    public float getMaxAltitude() {
        return Float.parseFloat(properties.getProperty("max_altitude"));
    }
}
