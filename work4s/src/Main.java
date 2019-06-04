import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] availableSpeed = {300, 500, 800};

        Dispatcher dispatcher = new Dispatcher();

        Thread[] planes = new Thread[20];

        for (var i = 0; i < 20; i++) {
            planes[i] = new Thread(new Plane("Пётр " + i, availableSpeed[new Random().nextInt(3)], dispatcher));
        }
    }
}
