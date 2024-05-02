package az.garage.due_may01;

public class Animal {

    public String name;
    public int age;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {

    public Dog (String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}

class Cat extends Animal {

    public Cat (String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}

class PersianCat extends Cat {

    public PersianCat () {
        this("default Persian cat name", 1);
    }

    public PersianCat (String name, int age) {
        super(name, age);
    }

}

class GoldenRetriever extends Dog {

    public GoldenRetriever () {
        this("default Golden Retriever dog name", 1);
    }

    public GoldenRetriever (String name, int age) {
        super(name, age);
    }

}
