

class DieRoller{

    public static void main(String[] args){
	Die d6 = new Die(6);
	int num = d6.roll();
	writeFile(args[1], num);
    }
    
}
