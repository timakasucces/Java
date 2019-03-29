class Granny extends Character {
    Cowboy cowboy;

    Granny(String name, String action, Character context) {
        super(name, action, context);

        this.cowboy = new Cowboy(
                "А это ленивый и толстый пастух,",
                "Который бранится с коровницей строгою,",
                this
        );
    }
}