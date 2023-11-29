import java.util.Timer;
import java.util.TimerTask;

public class timmer 
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() 
        {

            @Override
            public void run() 
            {
                System.out.println("TASK COMPLETED");
                timer.cancel();
                 System.out.print("\033c"); // CLEAR THE SCREEN
                System.exit(0);
            }
            
        };

        timer.schedule(task , 3000);
    }
}
