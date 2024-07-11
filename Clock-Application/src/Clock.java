import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock implements Runnable {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
    private volatile boolean running = true;

    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public void runClock() {
        while (running) {
            System.out.println(getCurrentTime());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        runClock();
    }

    public static void main(String[] args) {
        Clock clock = new Clock();

        Thread clockThread = new Thread(clock);
        clockThread.setPriority(Thread.MAX_PRIORITY);

        clockThread.start();
    }
}