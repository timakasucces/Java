public class AdultBird extends AnimalClass implements Bird {
    AdultBird(String name) {
        super(name);
        this.food = getBirdFood();
    }

    @Override
    public String getBirdFood() {
        return "seed";
    }
}
