public class Cage {
    AnimalClass adultAnimal;
    AnimalClass childAnimal;
    Cage nextCage;

    Cage(AnimalClass adultAnimal, AnimalClass childAnimal) {
        this.adultAnimal = adultAnimal;
        this.childAnimal = childAnimal;
    }

    Cage add(AnimalClass adultAnimal, AnimalClass childAnimal) {
        this.nextCage = new Cage(adultAnimal, childAnimal);
        return this.nextCage;
    }

    void getFood(String food) {
        if (food.equals("water")) {
            this.adultAnimal.getWater();
            this.childAnimal.getWater();
            if (this.nextCage != null) {
                this.nextCage.getFood(food);
            }
        } else {
            if (this.adultAnimal.food.equals(food)) {
                System.out.println(this.adultAnimal.name + " was fed!");
            }
            if (this.childAnimal.food.equals(food)) {
                System.out.println(this.childAnimal.name + " was fed!");
            }

            if (this.nextCage != null) {
                this.nextCage.getFood(food);
            }
        }
    }
}
