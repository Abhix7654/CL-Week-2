package IntroductionOfInheritance.animalhierarchy;

public class AnimalHierarchy {

    public static void main(String[] args) {

        // Now, create instances of inner classes using the animal instance
        Animal dog = new Dog("German", 23);
        Animal cat = new Cat("Billu", 25);
        Animal bird = new Bird("Parrot", 23);

        // Call makeSound on each instance
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

