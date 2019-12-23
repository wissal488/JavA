package gestionEleves;

import java.util.ArrayList;
import java.util.Collections;


public class GroupeEleves {

	private ArrayList<Eleve> listeEleves= new ArrayList<Eleve>();
	
	public int nombre() {
		return listeEleves.size();
	}
	
	public ArrayList<Eleve> getListe(){
		return listeEleves;
	}
	
	public void ajouterEleve(Eleve ele) {
		listeEleves.add(ele);
	}
	
	public Eleve chercher(String nom) {
		for(Eleve eleve:listeEleves) {
			if(eleve.getNom().equals(nom)) return eleve;
		}
		return null;
	}
	
	public void lister() {
		for(Eleve e:listeEleves) {
			System.out.println(e);
		}
	}
	
	public Eleve meilleurEleve() {
		return Collections.max(listeEleves);
		
	}
	public void trierEleves() {
		Collections.sort(listeEleves);
	}
	
}

