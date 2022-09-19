abstract class Animal {
    protected String name;

    abstract public void say();
}

class Cat extends Animal implements Sayable {
    private void meow() {
    }

    public void say() {
        meow();
    }
}

abstract class Canine extends Animal {
    protected boolean likeBones;
}

class Dog extends Canine implements Sayable {
    private void bark() {
    }

    public void say() {
        bark();
    }
}

class Robot implements Sayable {
    private void printOut() {
    }

    public void say() {
        printOut();
    }
}

interface Sayable {
    public void say();
}

public class test2 {
    public static void main(String args[]) {
        Dog baduki = new Dog();
        Cat nabi = new Cat();
        Robot robo = new Robot();
        // 객체화(인스턴스화) 한 건 Dog, Cat, Robot 밖에 없음.
        Animal aref = null; 
        Sayable sref = null;
        Canine cref = null;

        aref = baduki;
        aref.say();
        aref = nabi;
        aref.say();
        // aref = robo;
        aref.say();

        sref = baduki;
        sref.say();
        sref = nabi;
        sref.say();
        sref = robo;
        sref.say();

        cref = baduki;
        cref.say();
        // cref = nabi;
        cref.say();
        // cref = robo;
        cref.say();
    }
}
