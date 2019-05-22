public class ChildReptile extends AdultReptile implements Reptile{
    ChildReptile(String name) {
        super(name);
        this.food = getReptileFood();

    }

    @Override
    public String getReptileFood() {
        return "maggots";
    }
}
