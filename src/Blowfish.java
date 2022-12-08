public class Blowfish extends Fish implements AnimalMove, AnimalBehavior{
    private boolean isVulnerableToPollution;
    private int spikes;

    public int getSpikes() {
        return spikes;
    }
    public void setSpikes(int spikes) {
        this.spikes = spikes;
    }
    public boolean isVulnerableToPollution() {
        return isVulnerableToPollution;
    }
    public void setCanFly(boolean isVulnerableToPollution) {
        this.isVulnerableToPollution = isVulnerableToPollution;
    }

    public Blowfish(){}
    public Blowfish(String name,  int age, String breed, boolean canBreatheAir, int spikes, boolean isVulnerableToPollution){
        super(name, age, breed, canBreatheAir);
        this.isVulnerableToPollution = isVulnerableToPollution;
        this.spikes = spikes;
    }
    public Blowfish(String breed, boolean canBreatheAir, int spikes, boolean isVulnerableToPollution){
        super(breed, canBreatheAir);
        this.isVulnerableToPollution = isVulnerableToPollution;
        this.spikes = spikes;
    }

    public String toString() {
        return "Blowfish: " + "is it vulnerable to pollution = " + isVulnerableToPollution + ", how many spikes = " + spikes;
    }

    public void eat(){
        System.out.println("The Blowfish is eating algae"); //wodorosty
    }
    public void getVoice(){
        System.out.println("The Blowfish makes blob blob");
    }
    public void sleep(){
        System.out.println("The Blowfish is sleeping at the bottom of the sea");
    }
    public void move(){
        System.out.println("The Blowfish is swimming");
    }

}
