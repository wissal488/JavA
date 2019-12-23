package gestionEleves;

import java.util.ArrayList;

public class Eleve implements Comparable<Eleve> {

	 public String nom;
	 ArrayList<Integer> notes=new ArrayList<Integer>();
	 public double moy;
	 public double getMoyenne() {
		 return moy;
	 }
	 public void ajouterNote(int note) {
		 int nbnotes=notes.size();
		 if(note<0) note=0;
		 else if (note>20) note=20;
		 this.moy=(this.moy*nbnotes+note)/(nbnotes+1);
		 notes.add(note);
	 }
	 public String getNom() {
		 return this.nom;
	 }
	 public void setNom(String n) {
		 this.nom=n;
	 }
	 public ArrayList<Integer> getListeNotes(){
		 return notes;
	 }
	 public String toString() {
		 return "Le nom est "+this.nom+"\nLes notes sont:"+getListeNotes()+"\nLa moyenne est:"+this.moy;
	 }
	 public int compareTo(Eleve autreEleve) {
		// TODO Auto-generated method stub
		if(this.moy<autreEleve.moy) return -1;
		if(this.moy>autreEleve.moy) return 1;
		return 0;
	}
	
}

