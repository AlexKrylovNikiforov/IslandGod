package utility;

import model.creature.Animal;
import model.creature.Plant;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class PlantLoader {
    public Set<Class<? extends Plant>> loadPlantClasses() {
        Set<Class<? extends Plant>> classes = new HashSet<>();
        String basePackage = "src/main/java/model/creature/plant";

        File packageDirectory = new File(basePackage);
        if (packageDirectory.isDirectory()) {
            File[] files = packageDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".java")) {
                        String className = "model.creature.plant." + file.getName().replace(".java", "");
                        try {
                            Class<?> clazz = Class.forName(className);
                            if (Animal.class.isAssignableFrom(clazz) && !clazz.isInterface() && !clazz.isEnum()) {
                                classes.add(clazz.asSubclass(Plant.class));
                            }
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return classes;
    }
}
