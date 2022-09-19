abstract class Animal {
    private String name;

    abstract public void say();
}

class Cat extends Animal {
    private void meow() {
    }

    public void say() {
        meow();
    }
}

abstract class Canine extends Animal {
    protected boolean likeBones;
}

class Dog extends Canine {
    private void bark() {
    }

    public void say() {
        bark();
    }
}

public class test {
    public static void main(String args[]) {
        Animal a = null;
        Dog baduki = new Dog();
        Cat nabi = new Cat();

        a = baduki;
        a.say();
        a = nabi;
        a.say();

        //Animal c1 = new Animal();
        Animal c2 = new Cat();
        //Cat c3 = new Animal();
        Cat c4 = new Cat();

        //Animal d1 = new Canine();
        Animal d2 = new Dog();
        Canine d3 = new Dog();
        //Canine d4 = new Cat();
        //Dog d5 = new Canine();
        Dog d6 = new Dog();
    }
}