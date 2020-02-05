public class Canin extends Animal implements PetAnimal {
    public Canin()
    {
        System.out.println("Canin Class");
    }

    @Override
    public void petStatu() {
        System.out.println("Inside Canin: I can be friendly or hostlie, I don't know!");
    }
}
