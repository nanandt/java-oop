package progammer.amatir.application;

import progammer.amatir.data.Animal;
import progammer.amatir.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Genjor";
        animal.run();
    }
}
