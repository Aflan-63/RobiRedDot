public class Animal implements  PetAnimal{
    String name;
    public Animal()
    {
        System.out.println("Animal Class");
    }

    @Override
    public void petStatu() {
        System.out.println("I am inside Animal, I am not sure.");
    }
}
