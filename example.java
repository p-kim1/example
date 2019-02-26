import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.io.FileWriter;

public class example{
    public static void main(String[] args)
    {
	Random r = new Random();
	System.out.println(r.nextInt());
    }

	public static void writeFile(int dieNumber) throws IOException {
	    File file = new File("Die number");
		Writer writer = new FileWriter(file);
	    writer.write(dieNumber + "");
	    writer.close();


	}
}

