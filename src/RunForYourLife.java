/**
 * Write a description of class LetsGo here.
 *
 * @author Luthfi Musthafa-1506673656
 * @version 2018.04.21
 */
public class RunForYourLife implements Runnable
{
    // instance variables - replace the example below with your own
    private Thread t;
    private String namaThread;
    private int timeDelay;
    private int[] arrayDelay;

    /**
     * Constructor for objects of class RunForYourLife.
     * untuk membuat thread.
     */
    public RunForYourLife(String nama)
    {
        // initialise instance variables
        namaThread = nama;
        System.out.println(namaThread+", ready.");
    }

    /**
     * method untuk menjalankan thread
     */
    public void run()
    {
        //
        System.out.println(namaThread+", go!");
        try {
            for(int i = 1; i <= 20; i++) {
                System.out.println(namaThread+" has passed checkpoint ("+i+")");
                arrayDelay = LetsGo.random();
                if(namaThread.equals("Messi")){
                    timeDelay = arrayDelay[0];
                    Thread.sleep(timeDelay);
                }
                else if(namaThread.equals("Andres")){
                    timeDelay = arrayDelay[1];
                    Thread.sleep(timeDelay);
                }
                else{
                    timeDelay = arrayDelay[2];
                    Thread.sleep(timeDelay);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(namaThread +" was interrupted.");
        }
        System.out.println(namaThread + " has finished!");
    }

    /**
     * method untuk memulai thread
     */
    public void start()
    {
        //
        System.out.println(namaThread+", set..");
        if (t == null) {
            t = new Thread (this, namaThread);
            t.start ();
        }
    }
}
