package OPP_Class.StopWatch;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime starTime, endTime;
    public StopWatch() {
        this.starTime = LocalTime.now();
    }
    public void star() {
        this.starTime = LocalTime.now();
    }
    public void stop () {
        this.endTime = LocalTime.now();
    }
    public Duration getElapsedTime() {
        Duration elapsedTime = Duration.between(this.starTime,this.endTime);
        return elapsedTime;
    }
}
