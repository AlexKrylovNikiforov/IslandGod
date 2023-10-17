package utility;

import model.creature.Animal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class CreatureLoader {

    public Set<Class<? extends Animal>> loadCreatureClasses() {
        Set<Class<? extends Animal>> classes = new HashSet<>();
        String basePackage = "src/main/java/model/creature/animal"; // Путь к пакету

        File packageDirectory = new File(basePackage);
        if (packageDirectory.isDirectory()) {
            File[] files = packageDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".java")) {
                        String className = "model.creature.animal." + file.getName().replace(".java", "");
                        try {
                            Class<?> clazz = Class.forName(className);
                            if (Animal.class.isAssignableFrom(clazz) && !clazz.isInterface() && !clazz.isEnum()) {
                                classes.add(clazz.asSubclass(Animal.class));
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