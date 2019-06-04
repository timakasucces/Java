import java.util.Arrays;

class Dispatcher {
    boolean isAvailable = true;
    int[] airways = new int[150];

    Dispatcher() {
        Arrays.fill(airways, 3);
    }

    int setAirway(int airwayNum) {
//        isAvailable = false;
        if (airways[airwayNum] > 0) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
////                TODO: Handle exception
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//              TODO: Handle exception
            }
//            isAvailable = true;
            notify();
            return airways[airwayNum]--;
        }
        return 0;
    }
}
