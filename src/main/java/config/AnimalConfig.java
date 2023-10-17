package config;

import model.creature.Animal;
import utility.CreatureLoader;
import utility.PropertiesReader;

import java.util.*;

public class AnimalConfig {
    private static final String SETTINGS_PACKAGE_NAME = "src/main/resources/creature_settings";
    private static final String EXTENSION = ".properties";
    public static float MAX_WEIGHT;
    public static int SPEED;
    public static float MAX_SATIETY;
    public static final Set<Class<? extends Animal>> animalClasses;

    static {
        CreatureLoader cl = new CreatureLoader();
        animalClasses = cl.loadCreatureClasses();
        animalClasses.forEach(aclass -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SETTINGS_PACKAGE_NAME)
                    .append(aclass.getSimpleName().toLowerCase())
                    .append(EXTENSION);
            String settingsFileName = stringBuilder.toString();
            PropertiesReader propertiesReader1 = new PropertiesReader(settingsFileName);
            List<Class <? extends Number>> parameters = new ArrayList<>();
            MAX_WEIGHT = propertiesReader1.getMaxWeight();
            SPEED = propertiesReader1.getSpeed();
            MAX_SATIETY = propertiesReader1.getMaxSatiety();
        });
    }
}
