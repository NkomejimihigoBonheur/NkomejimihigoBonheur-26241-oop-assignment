

public class ClassCastExceptionExample {
    static class Animal {
        void sound() {
            System.out.println("This is an animal.");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Valid cast
        myAnimal.sound();

        try {
            Cat myCat = (Cat) myAnimal; // Invalid cast
            myCat.sound();
        } catch (ClassCastException e) {
            System.err.println("ClassCastException occurred: " + e.getMessage());
        }
    }
}
