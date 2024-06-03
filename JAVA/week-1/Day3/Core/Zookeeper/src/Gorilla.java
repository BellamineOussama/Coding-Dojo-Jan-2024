public class Gorilla extends Mammal{


    public void throwSomething(){
        int energy = getEnergy();
        energy -= 5;
        setEnergy(energy);
        System.out.println("the gorilla has thrown something");
    }

    public void eatBananas(){
        int energy = getEnergy();
        energy += 10 ;
        setEnergy(energy);
        System.out.println("the gorilla is happy");
    }

    public void climb(){
        int energy = getEnergy();
        energy -= 10;
        setEnergy(energy);
        System.out.println("the gorilla has climbed a tree");
    }
}