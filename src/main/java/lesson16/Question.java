package lesson16;

public class Question {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new LogWriter());
            thread.setName("Thread" + i);
            thread.start();
        }
    }
}
