public class User {

    private String name;

    // class contructor
    public User(String _name) {
        name = _name;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String _name) {
        name = _name;
    }

    // called when a subscribed Fano finishes a lap
    public void update(Fano _fano) {
        System.out.println("(" + name + ") Lap done by the Fano " + _fano.getNumber() + " in " + _fano.getLapTime() + " seconds.");
    }

}
