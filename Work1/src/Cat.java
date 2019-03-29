class Cat extends Character {
    Dog dog;

    Cat(String name, String action, Character context) {
        super(name, action, context);

        this.dog = new Dog(
                "Вот пес без хвоста,",
                "Который за шиворот треплет кота,",
                this
        );
    }
}