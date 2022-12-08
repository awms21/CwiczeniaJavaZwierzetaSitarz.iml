public class Fish extends Animal implements AnimalMove{
    private String breed;
    private boolean canBreatheAir;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public boolean canItBreatheAir() {
        return canBreatheAir;
    }
    public void setBreatheAir(boolean canBreatheAir) {
        this.canBreatheAir = canBreatheAir;
    }

    public Fish(){}
    public Fish(String name,  int age, String breed, boolean canBreatheAir){
        super(name, age);
        this.breed = breed;
        this.canBreatheAir = canBreatheAir;
    }
    public Fish(String breed, boolean canBreatheAir){
        this.breed = breed;
        this.canBreatheAir = canBreatheAir;
    }
    public String toString() {
        return "Fish: " + "breed = " + breed + ", can it breathe air = " + canBreatheAir;
    }
}
