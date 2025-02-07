class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}


class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Woof Woof!");
    }
}


class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Meow Meow!");
    }
}


class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " Bird Sound !");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Bruno", 3);
        Animal cat = new Cat("Gennie", 2);
        Animal bird = new Bird("Mitthu", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
