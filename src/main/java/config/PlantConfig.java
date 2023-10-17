package config;

import model.creature.Animal;
import model.creature.Plant;
import utility.PlantLoader;
import utility.PropertiesReader;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlantConfig {
    private static final String SETTINGS_PACKAGE_NAME = "src/main/resources/plant_settings";
    private static final String EXTENSION = ".properties";
    public static float MAX_WEIGHT;
    public static float MAX_ALTITUDE;

    public static Set<Class<? extends Plant>> plantClasses = new HashSet<>();

    static {
        PlantLoader pl = new PlantLoader();
        plantClasses = pl.loadPlantClasses();
        plantClasses.forEach(pClass -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SETTINGS_PACKAGE_NAME).append(pClass.getSimpleName().toLowerCase()).append(EXTENSION);
            String settingsFileName = stringBuilder.toString();
            PropertiesReader propertiesReader = new PropertiesReader(settingsFileName);
            MAX_WEIGHT = propertiesReader.getMaxWeight();
            MAX_ALTITUDE = propertiesReader.getMaxAltitude();
        });

    }
}
