import java.util.Calendar;

public class SimpleClockApplication implements Runnable {

    private boolean running;

    public SimpleClockApplication() {
        this.running = true;
    }

    @Override
    public void run() {
        while (running) {
            try {
                // Get current date and time
                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int minute = cal.get(Calendar.MINUTE);
                int second = cal.get(Calendar.SECOND);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH) + 1; // Month is 0-indexed
                int year = cal.get(Calendar.YEAR);

                // Format and print the time
                String formattedTime = String.format("%02d:%02d:%02d %02d-%02d-%d", hour, minute, second, day, month, year);
                System.out.println(formattedTime);

                // Sleep for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        this.running = false;
    }

    public static void main(String[] args) {
        // Create clock and update thread
        SimpleClockApplication clock = new SimpleClockApplication();
        Thread updateThread = new Thread(clock);
        updateThread.setPriority(Thread.MAX_PRIORITY); // Set higher priority

        // Start update thread
        updateThread.start();

        // Main thread continuously runs (simulates no priority)
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
