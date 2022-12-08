
public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        //animal[0] = new Animal();

        animal[0] = new Bird("Brown", true);
        animal[1] = new Pigeon("Karol", 4, "Whiterunner", true, 4, true);
        animal[2] = new Mammal("dachshund", true); //jamnik
        animal[3] = new Dog("Thomas", 6, "husky", true, true, 110);
        animal[4] = new Fish("tetraodonitidae", false);
        animal[5] = new Blowfish("Steve", 2, "tetraodonitidae", false, 18, true);

        for (int i = 0; i < animal.length; i++) {
            animal[i].eat();
            animal[i].getVoice();
            AnimalName.name(animal[i].getName());
            System.out.println(animal[i].toString());
        }

        AnimalBehavior animalBehaviors[] = new AnimalBehavior[3];
        animalBehaviors[0] = new Pigeon();
        animalBehaviors[1] = new Dog();
        animalBehaviors[2] = new Blowfish();

        for (AnimalBehavior animalistic: animalBehaviors) {
            animalistic.sleep();
        }

    }
}