public class Bird extends Animal implements AnimalMove{
    private String breed;
    private boolean canFly;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public boolean CanItFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird(){}
    public Bird(String name,  int age, String breed, boolean canFly){
        super(name, age);
        this.breed = breed;
        this.canFly = canFly;
    }
    public Bird(String breed, boolean canFly){
        this.breed = breed;
        this.canFly = canFly;
    }
    public String toString() {
        return "Bird: " + "breed = " + breed + ", can it fly = " + canFly;
    }
}
