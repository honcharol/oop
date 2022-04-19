package ku.oleg;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat("bitch", 4);
        Dog.name = "hui";

        System.out.println(animal.eat());
        System.out.println(dog.eat());
        System.out.println(cat.eat());

        System.out.println(dog.name);

    }
}
