

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("An animal makes a sound");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("A dog barks");
    }

    public String getBreed() {
        return breed;
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.speak();
    }
}
