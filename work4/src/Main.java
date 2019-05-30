import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] availableSpeed = {300, 500, 800};

        Plane[] planes = new Plane[5];

        long startTime = System.currentTimeMillis();

        for (var i = 0; i < 5; i++) {
            planes[i] = new Plane("Пётр " + i, availableSpeed[new Random().nextInt(2)]);

        }
    }
}