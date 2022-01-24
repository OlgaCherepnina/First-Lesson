package lesson16;

import java.io.IOException;
import java.util.Random;

public class LogWriter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Logger.saveLog(getLevel(), Thread.currentThread().getName(), "Message " + i + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(new Random().nextLong(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Logger.Level getLevel() {
        return Logger.Level.values()[new Random().nextInt(4)];
    }

}
