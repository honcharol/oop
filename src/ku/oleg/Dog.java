package ku.oleg;

public class Dog extends Animal {
//    public String name = "fghj";

    public Dog(){

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String eat() {
        return "dog eats bone";
    }
}
