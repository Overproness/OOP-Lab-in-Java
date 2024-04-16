 class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

 class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

 class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

 class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }
}

public class Task_3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.eat();
        dog.sound();

        cat.eat();
        cat.sound();

        bird.eat();
        bird.sound();
    }
}