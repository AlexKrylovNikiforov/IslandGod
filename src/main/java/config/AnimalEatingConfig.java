package config;

import model.creature.Animal;
import utility.CreatureLoader;
import utility.PropertiesReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnimalEatingConfig {
    private static final String PACKAGE_NAME = "src/main/resources/eating_probabilities";
    private static final String EXTENSION = ".properties";

    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Float>> eatingProbability = new HashMap<>();
    public static final Set<Class<? extends Animal>> animalClasses;
    static {
        CreatureLoader cl = new CreatureLoader();
        animalClasses = cl.loadCreatureClasses();
        animalClasses.forEach(aClass -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(PACKAGE_NAME).append(aClass.getSimpleName().toLowerCase()).append(EXTENSION);
            String fileName = stringBuilder.toString();
            PropertiesReader propertiesReader = new PropertiesReader(fileName);
            Map<Class<? extends Animal>, Float> animalEatingProbabilities = new HashMap<>();
            eatingProbability.put(aClass, animalEatingProbabilities);
            String animalClassName = aClass.getSimpleName().toLowerCase();
            Float eatingProbability = propertiesReader.getEatingProbabilityFor(animalClassName);
            animalClasses.forEach(animalClass -> {
                animalEatingProbabilities.put(animalClass, eatingProbability);
            });
        });
    }
}


