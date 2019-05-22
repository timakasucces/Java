public abstract class AnimalClass implements Animal{
    Boolean fedUp;
    String name;
    String food;

    AnimalClass(String name) {
        this.name = name;
        this.fedUp = false;
    }

    @Override
    public void getWater() {
        System.out.println(this.name + " got water!");
    }

}
