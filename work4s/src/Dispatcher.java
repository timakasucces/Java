import java.util.Arrays;

class Dispatcher {
    int[] airways = new int[150];
    private boolean isAvailable = true;
    private static final Object monitor = new Object();

    Dispatcher() {
        Arrays.fill(airways, 3);
    }

    synchronized void setAirway(int airwayNum) {
            isAvailable = false;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            airways[airwayNum] = airways[airwayNum] - 1;
            isAvailable = true;
            notifyAll();
    }

    synchronized void contactDispatcher(Plane plane) {
            if (!isAvailable) {
                System.out.println("Самолет \"" + plane.name + "\" ждет ответа диспетчера");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
