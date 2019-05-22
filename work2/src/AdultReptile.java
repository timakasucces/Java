public class AdultReptile extends AnimalClass implements Reptile, Animal{

    AdultReptile(String name) {
        super(name);
        this.food = getReptileFood();
    }

    @Override
    public String getReptileFood() {
        return "insects";
    }
}
