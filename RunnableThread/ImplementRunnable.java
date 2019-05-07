package RunnableThread;

public class ImplementRunnable implements Runnable {

    private  int threadIndex;
    public ImplementRunnable(int index)
    {
        this.threadIndex = index;
    }

    public void run()
    {
        int clientNumber = 1;
        while (clientNumber != 100)
        {
            System.out.println("Server: " + this.threadIndex + " sent data to client: " + clientNumber);
            clientNumber++;
        }
    }
//this start method is a overriding and is used to implement only another method in Main.java
    public void start()
    {
        Thread thread = new Thread(this);
        thread.start();
    }
}
