 abstract class Character {
    String name;
    String action;

    /** Контекст, в котором происходит действие
    * Например:
    *   А это пшеница,
    *   Которая в темном чулане хранится
    *   В доме, Который построил Джек.
    *
    *   Персонаж: А это пшеница
    *   Действие: Которая в темном чулане хранится
    *   Контекст: Дом, который построил Джек
    */
    private Character context;

    /**
     *  Конструктор персонажа
     * @param name    Имя персонажа
     * @param action  Действие персонажа
     * @param context Контекст действия (является объектом персонажа)
     */
    Character(String name, String action, Character context) {
         this.name = name;
         this.action = action;
         this.context = context;

         System.out.println(this.name);
         this.execute();

         checkContext(context);
     }

     private void execute() {
         System.out.println(this.action);
     }

     /**
      * Рекурсивная проверка контекста.
      * Если контекст есть - вывод на экран
      * @param contextChar  Объект персонажа, который является контекстом действия
      * */
     private void checkContext(Character contextChar) {
        if (contextChar != null) {
            contextChar.execute();
            checkContext(contextChar.context);
        }
     }
}

class House extends Character {
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

class Cocks extends Character {
    Cocks(String name, String action, Character context) {
        super(name, action, context);
    }
}