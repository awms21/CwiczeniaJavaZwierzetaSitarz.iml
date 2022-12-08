public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private boolean isFast;
    private int toes;

    public int getToes() {
        return toes;
    }
    public void setToes(int toes) {
        this.toes = toes;
    }
    public boolean isFast() {
        return isFast;
    }
    public void setCanFly(boolean isFast) {
        this.isFast = isFast;
    }

    public Pigeon(){}
    public Pigeon(String name,  int age, String breed, boolean canFly, int toes, boolean isFast){
        super(name, age, breed, canFly);
        this.isFast = isFast;
        this.toes = toes;
    }
    public Pigeon(String breed, boolean canFly, int toes, boolean isFast){
        super(breed, canFly);
        this.isFast = isFast;
        this.toes = toes;
    }

    public String toString() {
        return "Pigeon: " + "is it fast = " + isFast + ", how many toes = " + toes;
    }

    public void eat(){
        System.out.println("The pigeon is eating a long worm");
    }
    public void getVoice(){
        System.out.println("The pigeon sings a heard song");
    }
    public void sleep(){
        System.out.println("The pigeon is sleeping on the building");
    }
    public void move(){
        System.out.println("The pigeon is running on the grass to catch the worm");
    }

}
