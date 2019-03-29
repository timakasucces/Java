class Cow extends Character {
    Granny granny;

    Cow(String name, String action, Character context) {
        super(name, action, context);

        this.granny = new Granny(
                "А это старушка, седая и строгая,",
                "Которая доит корову безрогую,",
                this
        );
    }
}