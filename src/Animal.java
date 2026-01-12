public class Animal {
    private boolean isAlive;
    private String name;
    private int LifeSpan;

    Animal(String name, int LifeSpan){
        this.name = name;
        this.LifeSpan = LifeSpan;
        this.isAlive = true;
    }

    void PrintAnimal(){
        System.out.println("Animal: " + name + ", LifeSpan :" + LifeSpan + " years " + ", isAlive: " + isAlive);

    }

    void die(){
        boolean isAlive = false;
        System.out.println("Animal: " + name + " Died");
    }
}
