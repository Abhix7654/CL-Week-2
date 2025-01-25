package IntroductionOfInheritance.animalhierarchy;

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " " + age + " Bark");
    }
}

