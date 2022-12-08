public class Dog extends Mammal implements AnimalMove, AnimalBehavior {
    private boolean isloud;
    private int length;

    public boolean getisloud() {return isloud;}
    public void setisloud(boolean isloud) {
        this.isloud = isloud;
    }
    public int getlength() {
        return length;
    }
    public void setlength(int length) {
        this.length = length;
    }

    public Dog() {
    }
    public Dog(String name, int age, String breed, boolean haveLegs, boolean isloud, int length) {
        super(name, age, breed, haveLegs);
        this.isloud = isloud;
        this.length = length;
    }
    public Dog(String breed, boolean haveLegs, boolean isloud, int length) {
        super(breed, haveLegs);
        this.isloud = isloud;
        this.length = length;
    }

    public String toString() {
        return "Dog: " + "is it loud = " + isloud + ", how long is it (cm) = " + length;
    }

    public void eat() {
        System.out.println("The dog is eating a piece of meat");
    }
    public void getVoice() {
        System.out.println("The dog barks");
    }
    public void sleep() {
        System.out.println("The dog is sleeping on the cushion");
    }
    public void move() {
        System.out.println("The dog is running to bite a kid");
    }
}