package EX2;

public class Compteur extends Thread {
	
	public String nom;
	public int maxValue;
	
	public Compteur(String nom, int maxValue) {
		this.nom=nom;
		this.maxValue=maxValue;
	}
	
	public Compteur(String nom) {
		this(nom,10);
	}
	
	public void run() {
		try {
			for(int i=1;i<maxValue;i++) {
				System.out.println("Le nom de Thread est: "+nom+" La valeur est: "+i);
				sleep(100);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
	}

}
