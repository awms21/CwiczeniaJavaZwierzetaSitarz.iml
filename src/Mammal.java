public class Mammal extends Animal implements AnimalMove{
    private String breed;
    private boolean haveLegs;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public boolean itHaveLegs() {
        return haveLegs;
    }
    public void setHaveLegs(boolean haveLegs) {
        this.haveLegs = haveLegs;
    }

    public Mammal(){}
    public Mammal(String name,  int age, String breed, boolean haveLegs){
        super(name, age);
        this.breed = breed;
        this.haveLegs = haveLegs;
    }
    public Mammal(String breed, boolean haveLegs){
        this.breed = breed;
        this.haveLegs = haveLegs;
    }
    public String toString() {
        return "Mammal: " + "breed = " + breed + ", does it have legs = " + haveLegs;
    }
}
