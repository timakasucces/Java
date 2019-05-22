public class Main {

    public static void main(String[] args) {
        Cage cage = new Cage(
                new AdultHerbivoreMammal("Mountain goat"),
                new ChildHerbivoreMammal("Mountain goat child")
        );
        cage.add(new AdultCarnivoreMammal("Bengal tiger"),
                 new ChildCarnivoreMammal("Bengal tiger child"))
            .add(new AdultBird("Smallow"),
                 new ChildBird("Smallow child"))
            .add(new AdultReptile("Serpent viper"),
                     new ChildReptile("Serpent viper child"));

        ZooKeeper.loadFood(cage);
    }
}
