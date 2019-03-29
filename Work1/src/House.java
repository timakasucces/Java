public class House extends Character {
    Wheat wheat;

    House(String name, String action) {
        super(name, action, null);

        this.action = "В доме, " + this.action;

        this.wheat = new Wheat(
                "А это пшеница,",
                "Которая в темном чулане хранится,",
                this
        );
    }
}