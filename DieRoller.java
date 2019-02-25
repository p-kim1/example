

class DieRoller{

    public static void main(String[] args){
	Die d6 = new Die(6);
	int num = d6.roll();
	example.writeFile(num);
    }
    
}
