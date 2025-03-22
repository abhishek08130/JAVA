// Define inheritance and its types. Write a Java program that demonstrates inheritance by defining a super class "Animal" and 2 sub classes "Bird" and "Mammal". The Animal class should have a method called "makeSound" and each subclass should provide its own implementation of this method to represent the sound that the specific animal makes. Additionally, each subclass should have a unique property or behavior related to the type of animal it represents.
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

 class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps.");
    }

    public void fly() {
        System.out.println("The bird flies.");
    }
}

class Mammal extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The mammal roars.");
    }

    public void giveBirth() {
        System.out.println("The mammal gives birth.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        animal.makeSound();
        bird.makeSound();
        bird.fly();
        mammal.makeSound();
        mammal.giveBirth();
    }
}
