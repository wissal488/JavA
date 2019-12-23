package EX1;

public class Thr_ead extends Thread{
	int valeur;
	
	public Thr_ead(int val) {
		valeur=val;
	}
	
	public void run() {
		if(valeur==1) {
			for(int i=1;i<=1000;i++) {
				System.out.println("TA = "+i+" ");
			}
		}
		if(valeur==1000) {
			for(int j=1000;j>=1;j--) {
				System.out.println("TB = "+j+" ");
			}
		}
		if(valeur!=1 && valeur!=1000) {
			System.out.println("Le nombre saisit n'est pas correct.\nSaisit un nombre soit 1 ou 1000!!!");
		}
	}

	public static void main(String[] args) {
		
		new Thr_ead(1).start();
		new Thr_ead(1000).start();

	}

}
