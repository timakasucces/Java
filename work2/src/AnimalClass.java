public abstract class AnimalClass implements Animal{
    String name;
    String food;

    AnimalClass(String name) {
        this.name = name;
    }

    @Override
    public void getWater() {
        System.out.println(this.name + " got water!");
    }

}
