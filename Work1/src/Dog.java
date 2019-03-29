class Dog extends Character {
    Cow cow;

    Dog(String name, String action, Character context) {
        super(name, action, context);

        this.cow = new Cow(
                "А это корова безрогая,",
                "Лягнувшая старого пса без хвоста,",
                this
        );
    }
}