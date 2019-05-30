import java.util.TimerTask;

public class LocationSender extends TimerTask {
    Plane plane;
    long departure;

    LocationSender(Plane plane, long departure) {
        this.plane = plane;
        this.departure = departure;
    }

    @Override
    public void run() {
        if (this.plane.isAlive()) {
            long time = System.currentTimeMillis() - this.departure;

            System.out.println(
                "Самолет \"" + plane.getName() + "\" находится на расстоянии " + plane.speed * time / 60000 + " км от A"
            );
        }
    }
}
