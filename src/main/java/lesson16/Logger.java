package lesson16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    public enum Level {
        ERROR,
        WARN,
        INFO,
        DEBUG,
        TRACE
    }

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void saveLog(Level level, String clazz, String message) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            String time = formatter.format(LocalDateTime.now());
            String log = String.format("%s %s %s %s", time, level.name(), clazz, message);
            writer.write(log);
            System.out.print(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
