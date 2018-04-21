import java.util.Random;
import java.util.Arrays;
/**
 * Class LetsGo untuk menjalankan program utama threading.
 *
 * @author Luthfi Musthafa-1506673656
 * @version 2018.04.21
 */
public class LetsGo
{
    // instance variables - replace the example below with your own
    private static final int min = 100;
    private static final int max = 500;
    private static final Random r = new Random();
    public static int x;
    public static int[] random = new int[3];

    /**
     * Constructor for objects of class LetsGo
     */
    public LetsGo()
    {
        // initialise instance variables
    }

    /**
     * method random untuk mencari nilai random dari delay thread
     *
     * @return random
     */
    public static int[] random()//String nama)
    {
        //
        for (int i=0; i<3; i++){
            random[i] = r.nextInt(max-min)+min;
        }
        Arrays.sort(random);

        return random;
    }

    /**
     * method untuk menjalankan program utama
     *
     * @param args array of string
     */
    public static void main(String[] args)
    {
        //
        System.out.print('\u000C'); //clear screen
        RunForYourLife R1 = new RunForYourLife("Lionel");
        R1.start();
      
        RunForYourLife R2 = new RunForYourLife("Andres");
        R2.start();
        
        RunForYourLife R3 = new RunForYourLife("Messi");
        R3.start();
    }
}
