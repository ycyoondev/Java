package jump2java;

public class Inheritance extends Animal {
    public void sleep() {
        System.out.println(this.name+" zzz");
    }
    public static void main(String[] args) {
        Inheritance dog = new Inheritance();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
/*
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}
 */