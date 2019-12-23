package EX4;

public class Voiture implements Runnable{

	public String nom;
	public Parking park;
	
	public Voiture(String nom, Parking park) {
		this.nom=nom;
		this.park=park;
	}
	
	public String toString() {
		return nom;
	}
	
	public void rentrer() {
		try {
			while(!(this.park.accept(this))) {
				Thread.sleep((long) (1000*Math.random()));
				System.out.println(nom+" je vous rentrer");
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
	}
	
	public void run() {
		try {
			while(true) {
				Thread.sleep((long) (50000*Math.random()));
				System.out.println(nom+"Je demande à rentre\n");
				rentrer();
				System.out.println(nom+"Je viens d'entrer\n");
				Thread.sleep((long) (50000* Math.random()));
				System.out.println(nom+"je demande à sortir\n");
				this.park.sortir(this);
			}
		}catch (InterruptedException e) {
			// TODO: handle exception
			return;
		}
	}
		
		public static void main(String[] args) {
			 int taille_park=5;
			 int nbVoitures=10;
			Parking park=new Parking(taille_park);
			
			Thread voitures[] = new Thread[nbVoitures];
			
			for(int i=0;i<nbVoitures;i++) {
				voitures[i]=new Thread(new Voiture(String.format("Voit "+i),park));
				voitures[i].start();
			}
		}
	}

