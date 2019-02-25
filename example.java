import java.io.File;
import java.util.Random;

public class example{
    public static void main(String[] args)
    {
	Random r = new Random();
	System.out.println(r.nextInt());
    }
	public static void writeFile(int dieNumber){

	    File file = new File("Die number");
	    file.write(dieNumber);
	    

	}
}

