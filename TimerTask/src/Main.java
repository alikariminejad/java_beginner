import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer = A facility for threads to schedule tasks
        //         for future execution in background

        // TimerTask = A task that can be scheduled for one-time
        //             or repeated execution by a Timer

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int counter = 10;
            @Override
            public void run() {
                if(counter > 0){
                    System.out.println(counter + " Seconds");
                    counter--;
                }
                else{
                    System.out.println("Happy new year!!!!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2025);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);
//        timer.schedule(task, date.getTime());
        //timer.schedule(task, 3000);
        timer.scheduleAtFixedRate(task,0,1000);
//        timer.scheduleAtFixedRate(task,date.getTime(),1000);

    }
}