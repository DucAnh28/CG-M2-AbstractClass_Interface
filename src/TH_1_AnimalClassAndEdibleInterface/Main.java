package TH_1_AnimalClassAndEdibleInterface;

import TH_1_AnimalClassAndEdibleInterface.Edible.Edible;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (int i = 0; i < animals.length; i++) {
            for (Animal animal : animals
                 ) {
                System.out.println(animal.makeSound());

                if (animal instanceof Chicken){
                    Edible edibler = (Chicken) animal;
                    System.out.println(edibler.howToEat());
                }
            }
        }
    }
}
