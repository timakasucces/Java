public class AdultHerbivoreMammal extends AnimalClass implements Herbivore{
    AdultHerbivoreMammal(String name) {
        super(name);
        this.food = getHerbivoreFood();
    }

    @Override
    public String getHerbivoreFood() {
        return "hay";
    }
}
