class Cowboy extends Character {
    Cocks cocks;

    Cowboy(String name, String action, Character context) {
        super(name, action, context);

        this.cocks = new Cocks("Вот два петуха,",
                "Которые будят того пастуха,",
                this
        );
    }
}