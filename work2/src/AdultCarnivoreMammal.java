public class AdultCarnivoreMammal extends AnimalClass implements Carnivore{
    AdultCarnivoreMammal(String name) {
        super(name);
        this.food = getCarnivoreFood();
    }

    @Override
    public String getCarnivoreFood() {
        return "meat";
    }
}
