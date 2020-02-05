public class TestClass {
    public TestClass(Animal animal)
    {
        animal.petStatu();
    }

    public TestClass(Canin canin) {
        canin.petStatu();
    }

    public TestClass(Lenub lenub) {
        lenub.petStatu();
    }

    public static void main(String[] args) {
        System.out.println("Test Class Declaration 1");
        // Animal Class
        // I am inside Animal, I am not sure.
        TestClass testClass = new TestClass(new Animal());
        System.out.println("Test Class Declaration 2");
        testClass = new TestClass(new Canin());
        System.out.println("Test Class Declaration 3");
        testClass = new TestClass(new Lenub());
        System.out.println("Test Class Declaration 4");
        testClass = new TestClass(new Dog());
        System.out.println("Test Class Declaration 5");
        testClass = new TestClass(new Cat());

        System.out.println("Animal Class");
        Animal animal = new Animal();
        System.out.println("Canin Class");
        Canin canin = new Canin();
        System.out.println("Lenub Class");
        Lenub lenub = new Lenub();
        System.out.println("Dog Class");
        Dog dog = new Dog();
        System.out.println("Cat Class");
        Cat cat = new Cat();

    }
}
