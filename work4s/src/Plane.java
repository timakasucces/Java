public class Plane extends Thread{
    private String name;
    private int speed;
    private Dispatcher dispatcher;
//    private static final class Lock { }
//    private final Object lock = new Lock();
    private int airwayNum = 0;

    Plane(String name, int speed, Dispatcher dispatcher) {
        this.name = name;
        this.speed = speed;
        this.dispatcher = dispatcher;


        System.out.println("Самолет \"" + this.name + "\" (скорость " + this.speed + "км/ч) готов к вылету");
//        this.run();
    }

    @Override
    public void run() {
        for (var i = 0; i < 5; i++) {
            if (dispatcher.isAvailable) {
                synchronized (dispatcher) {
                    while (dispatcher.setAirway(i) == 0) {
                        if (i == 0) {
                            System.out.println("Самолет \"" + this.name + "\" + ждет свободного коридора для взлета");
                        } else {
                            try {
                                System.out.println("Самолет \"" + this.name + "\" + ждет свободного коридора на участке " + i);
                                Thread.sleep(2 * 10 / this.speed * 60 * 1000);
                            } catch (InterruptedException e) {
//                          TODO: Handle exception
                            }
                        }
                    }
                    try {
                        System.out.println("Самолет \"" + this.name + "\" + проходит участок " + i);
                        Thread.sleep(10 / this.speed * 60 * 1000);
                        dispatcher.airways[i]++;
                    } catch (InterruptedException e) {
//                   TODO: Handle exception
                    }
                }
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
//                   TODO: Handle exception
                }
            }
        }
        System.out.println("Самолет \"" + this.name + "\" приземлился в Б");
    }
}
