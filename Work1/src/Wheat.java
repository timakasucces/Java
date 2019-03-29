class Wheat extends Character {
    Bird bird;

    Wheat(String name, String action, Character context) {
        super(name, action, context);

        this.bird = new Bird(
                "А это веселая птица-синица,",
                "Которая часто ворует пшеницу,",
                this
        );
    }
}