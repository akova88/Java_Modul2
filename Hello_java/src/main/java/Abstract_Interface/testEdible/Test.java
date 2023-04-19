package Abstract_Interface.testEdible;

import Abstract_Interface.test.Edible;
import Abstract_Interface.testEdible.animal.Animal;
import Abstract_Interface.testEdible.animal.Chicken;
import Abstract_Interface.testEdible.animal.Tiger;
import Abstract_Interface.testEdible.fruit.Apple;
import Abstract_Interface.testEdible.fruit.Fruit;
import Abstract_Interface.testEdible.fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken)animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
