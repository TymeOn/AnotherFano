public class Server {

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

}