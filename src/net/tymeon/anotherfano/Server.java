import java.util.ArrayList;

public class Server {

    // server attributes, list of known users and fanos
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Fano> fanos = new ArrayList<Fano>();

    // class constructor
    private Server() {
    }

    // class instance
    private static Server INSTANCE = null;

    // if the server already exists, then return the existing instance
    public static Server getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Server();
        }
        return INSTANCE;
    }

    // add a fano, if it doesn't exist already
    public void addFano(Fano fano) {
        for(Fano f : fanos) {
            if(f.getNumber() == fano.getNumber()) {
                System.out.println("Fano " + fano.getNumber() + " already exists!");
                return;
            }
        }
        fanos.add(fano);
        System.out.println("Fano " + fano.getNumber() + " successfully added.");
    }

    // add a user, if it doesn't exist already
    public void addUser(User user) {
        for(User u : users) {
            if(u.getName().equals(user.getName())) {
                System.out.println("User " + user.getName() + " already exists!");
                return;
            }
        }
        users.add(user);
        System.out.println("User " + user.getName() + " successfully added.");
    }


    // subscribe a user to a fano, only if they both exist in the server
    public void subscribeToFano(User user, Fano fano) {
        if (users.indexOf(user) != -1) {
            if (fanos.indexOf(fano) != -1) {
                fano.addSubscriber(user);
            } else {
                System.out.println("The Fano " + fano.getNumber() + " do not exist! Please create it first.");
            }

        } else {
            System.out.println("The User " + user.getName() + " do not exist! Please create it first.");
        }     
    }



}