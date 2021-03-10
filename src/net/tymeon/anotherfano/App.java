public class App {

    // main function
    public static void main(String[] args) throws Exception {
        System.out.println("AnotherFano - V1.0");

        // getting the instance of the server (singleton)
        Server server = Server.getInstance();

        // creating fanos
        Fano fanoFourtySix = new Fano(46, 1);
        Fano fanoTen = new Fano(10, 2);

        // adding fanos to the server
        server.addFano(fanoFourtySix);
        server.addFano(fanoTen);

        // creating users
        User userFirst = new User("premier");
        User userSecond = new User("second");

        // adding users to the server
        server.addUser(userFirst);
        server.addUser(userSecond);

        // subscribing users to some fanos
        server.subscribeToFano(userFirst, fanoFourtySix);
        server.subscribeToFano(userSecond, fanoTen);
        server.subscribeToFano(userSecond, fanoFourtySix);

        // wait 10 seconds before closing the program
        try {
            java.lang.Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
