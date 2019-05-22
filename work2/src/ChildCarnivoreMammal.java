public class ChildCarnivoreMammal extends AdultCarnivoreMammal {
    ChildCarnivoreMammal(String name) {
        super(name);
        this.food = getCarnivoreFood();
    }

    @Override
    public String getCarnivoreFood() {
        return "milk";
    }
}
