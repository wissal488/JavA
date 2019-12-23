package EX4;

import java.util.HashSet;

public class Parking {

	public int P_occupe;
	public int capacite;
	public HashSet<Voiture> v=new HashSet<Voiture>();
	Parking(int size){this.capacite=size;}
	int places() {return (this.capacite-this.P_occupe);}
	
	public synchronized boolean accept(Voiture myVoiture) {
		if(this.places()>0) {
			this.P_occupe++;
			v.add(myVoiture);
			System.out.println("Parking: "+myVoiture.nom+" acceptée, il reste "+this.places()+" places.\n");
			System.out.println("Voiture: "+v);
			return(true);
		}
		else {
			System.out.println("Parking: "+myVoiture.nom+" refusée, il reste "+places()+" places.\n");
            return(false);		
		}	
	}
	
	public synchronized void sortir(Voiture myVoiture) {
		P_occupe --;
		v.remove(myVoiture);
		System.out.println("Parking: "+myVoiture.nom+" est sortie, il reste "+places()+" places.\n");
	}
}