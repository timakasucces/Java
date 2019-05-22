public class ChildHerbivoreMammal extends AdultHerbivoreMammal {
    ChildHerbivoreMammal(String name) {
        super(name);
        this.food = getHerbivoreFood();
    }
}
