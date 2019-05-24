import java.util.Random;

class Inspector {
    static void checkHome(int day) throws NotHomeException {
        if (!new Random().nextBoolean()) {
            throw new NotHomeException(day);
        }
    }
}
