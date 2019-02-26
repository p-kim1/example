import java.io.IOException;

class DieRoller{

    public static void main(String[] args) throws IOException {
	Die d6 = new Die(6);
	int num = d6.roll();
	example.writeFile(num);
    }
    
}
