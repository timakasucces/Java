import java.util.Timer;
import java.util.TimerTask;

public class Plane extends Thread{
    int speed;

    Plane(String name, int speed) {
        super(name);

        this.speed = speed;
        start();
    }

//    private void sendLocation(long departure) {
//        while (this.isAlive()) {
//            long time = departure - System.currentTimeMillis();
//
//            if (time == 60000) {
//                System.out.println(
//                        "Самолет \"" + this.getName() + "\" находится на расстоянии " + time * this.speed + " км от A"
//                );
//            }
//        }
//    }

    public void run() {
        System.out.println("Самолет \"" + this.getName() + "\" (скорость " + this.speed + "км/ч) готов к вылету");

        Timer timer = new Timer(true);
        TimerTask locationSender = new LocationSender(this, System.currentTimeMillis());
        timer.schedule(locationSender, 0, 6000  );

        try {
            Thread.sleep((1500 / this.speed) * 60 * 1000);
        } catch (InterruptedException e) {
            System.out.println(
                    "Авиакатастрофа! Самолёт \"" + this.getName() + "\n упал по неизвестным причинам. Жертв нет."
            );
        }
//        timer.cancel();
        System.out.println("Самолет \"" + this.getName() + "\" приземлился в Б");
    }


}
