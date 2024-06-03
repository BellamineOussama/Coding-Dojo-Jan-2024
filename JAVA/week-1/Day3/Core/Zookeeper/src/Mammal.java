public class Mammal {
    private int energy;

    public Mammal() {
        this.energy = 100;
    }

    public Mammal(int energy){
        this.energy = energy;
    }

    public void displayEnergy() {
        System.out.println("Energy level: " + energy);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}