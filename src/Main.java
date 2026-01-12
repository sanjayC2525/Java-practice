public class Main {
    public static void main(String[] args){
        Animal animal1 = new Animal("monkey", 7);
        Animal animal2 = new Animal("cat", 5);

        animal1.PrintAnimal();
        animal2.PrintAnimal();
        animal2.die();

    }
}
