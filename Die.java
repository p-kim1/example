import java.util.Random;

class Die {
	private int numSides;
	private Random generator = new Random();

	// flexible constructor for different sided die
	Die(int numSides) { this.numSides = numSides; }

	public int roll() {
		return generator.nextInt(numSides) + 1; // generator.nextInt includes 0
	}
}
