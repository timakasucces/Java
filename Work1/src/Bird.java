class Bird extends Character {
    Cat cat;

    Bird(String name, String action, Character context) {
        super(name, action, context);

        this.cat = new Cat(
                "Вот кот,",
                "Который пугает и ловит синицу,",
                this
        );
    }
}
