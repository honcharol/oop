package ku.oleg;

public class Animal {
    public static String name;
    public int age;

    public Animal(){

    }

    public  Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String eat() {
        return "animal eats something";
    }
}
