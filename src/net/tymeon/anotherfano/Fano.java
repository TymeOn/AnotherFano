import javax.swing.Timer;

public class Fano {

    private Integer number;
    private Integer lapTime;

    // class constructor (also, starting the timer)
    public Fano(Integer _number) {
        number = _number;
        new Timer(2000, evt -> doLap()).start();
    }

    // getters
    public Integer getNumber() {
        return number;
    }

    public Integer getLapTime() {
        return lapTime;
    }

    // setters
    public void setNumber(Integer _number) {
        number = _number;
    }

    public void setLapTime(Integer _lapTime) {
        number = _lapTime;
    }

    // called every 2000ms by the Timer
    private void doLap() {
        System.out.println("Fano " + number + " finished a lap!");
    }

}
