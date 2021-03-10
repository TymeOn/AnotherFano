import java.util.ArrayList;
import javax.swing.Timer;

public class Fano {

    private Integer number;
    private Integer lapTime;
    private ArrayList<User> subscribers = new ArrayList<User>();

    // class constructor (also, starting the timer)
    public Fano(Integer _number, Integer _lapTime) {
        number = _number;
        lapTime = _lapTime;
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

    // add a fano, if it doesn't exist already
    public void addSubscriber(User user) {
        for(User s : subscribers) {
            if(s.getName().equals(user.getName())) {
                System.out.println("User " + user.getName() + " is already subscribed to Fano " + number);
                return;
            }
        }
        subscribers.add(user);
        System.out.println("User " + user.getName() + " successfully subscribed to Fano " + number + ".");
    }

    // called every 2000ms by the Timer
    private void doLap() {
        System.out.println("Fano " + number + " finished a lap in " + lapTime + " seconds.");
        for(User s : subscribers) {
            s.update(this);
        }
    }

}
