import model.creature.Animal;
import model.creature.Plant;
import utility.CreatureLoader;
import utility.PlantLoader;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CreatureLoader cl = new CreatureLoader();
        PlantLoader pl = new PlantLoader();
        Set<Class<? extends Animal>> classes = cl.loadCreatureClasses();
        Set<Class<? extends Plant>> plants = pl.loadPlantClasses();
        for(Class<?> aClass: classes) {
            System.out.println("Found class " + aClass.getSimpleName());
        }

        for(Class<?> plant: plants) {
            System.out.println("Found class " + plant.getSimpleName());
        }
    }
}

