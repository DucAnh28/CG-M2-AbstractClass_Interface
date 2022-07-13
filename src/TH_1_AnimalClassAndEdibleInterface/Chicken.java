package TH_1_AnimalClassAndEdibleInterface;

import TH_1_AnimalClassAndEdibleInterface.Edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: cluck-cluck";
    }

    public String howToEat(){
        return "Could be fried";
    }
}
