import java.util.Arrays;

public class Plane implements Runnable{
    private int speed;
    private Dispatcher dispatcher;
    String name;


    Plane(String name, int speed, Dispatcher dispatcher) {
        this.name = name;
        this.speed = speed;
        this.dispatcher = dispatcher;


        System.out.println("Самолет \"" + this.name + "\" (скорость " + this.speed + "км/ч) готов к вылету");
    }

    @Override
    public void run() {
//        for (var i = 0; i < 5; i++) {
//            dispatcher.contactDispatcher(this);
//            while (dispatcher.airways[i] == 0) {
//                if (i == 0) {
//                    System.out.println("Самолет \"" + this.name + "\" ждет свободного коридора для взлета");
//                } else {
//                    try {
//                        System.out.println("Самолет \"" + this.name + "\" ждет свободного коридора на участке " + i);
//                        Thread.sleep(2 * 10 / this.speed * 60 * 1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//            try {
//                if (i != 0) {
//                    dispatcher.airways[i - 1]++;
//                }
//                dispatcher.setAirway(i);
//                System.out.println("Самолет \"" + this.name + "\" проходит участок " + i);
//                System.out.println(Arrays.toString(dispatcher.airways));
//                Thread.sleep(10 / this.speed * 60 * 1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        int currentAirwayNum = 0;

        goToAirway(currentAirwayNum);
    }

    private boolean isAirwayFree(int airwayNum) {
        return dispatcher.airways[airwayNum] != 0;
    }

    private void goToAirway(int airwayNum) {
        if (airwayNum == 150) {
            dispatcher.airways[airwayNum - 1] += 1;
            System.out.println("Самолет \"" + this.name + "\" приземлился в Б");
            return;
        }
        dispatcher.contactDispatcher(this);
        if (isAirwayFree(airwayNum)) {
            dispatcher.setAirway(airwayNum);
            if (airwayNum != 0) {
                dispatcher.airways[airwayNum - 1] = dispatcher.airways[airwayNum - 1] + 1;
            }

            try {


                System.out.println("Самолет \"" + this.name + "\" проходит участок " + airwayNum);
                System.out.println(dispatcher.airways[airwayNum]);
                System.out.println('\n');

                Thread.sleep(10 / this.speed * 60 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            goToAirway(airwayNum + 1);
        } else {
            try {
                System.out.println("Самолет \"" + this.name + "\" ждет свободного коридора на участке " + airwayNum);
//                System.out.println('\n');

                Thread.sleep(2 * 10 / this.speed * 60 * 1000);
                goToAirway(airwayNum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
