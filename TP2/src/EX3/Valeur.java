package EX3;

public class Valeur {

	public int valeur;
	
	public Valeur(int valeur) {
		this.valeur=valeur;
	}
	
	public Valeur() {
		// TODO Auto-generated constructor stub
		getVal();
	}

	public int getVal() {
		return valeur;
	}
	
	public synchronized void add(int i) {
		valeur+=i;
	}
	
	public String toString() {
		return "La valeur est: "+valeur;
	}
}
