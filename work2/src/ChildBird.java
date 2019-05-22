public class ChildBird extends AdultBird implements Bird {
    ChildBird(String name) {
        super(name);
        this.food = getBirdFood();
    }

    @Override
    public String getBirdFood() {
        return "maggots";
    }
}
