public class Main {

    public static void main(String[] args) {

        ServerThread thread = new ServerThread("Server1");
        ServerThread thread2 = new ServerThread("Server2");

        thread.start();
        thread2.start();


    }
}
