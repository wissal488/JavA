package gestionEleves;


public class TestEleve {

	public static void main(String[] args) {
		Eleve e=new Eleve();
		e.setNom("Wissal");
		e.ajouterNote(19);
		e.ajouterNote(18);
		e.ajouterNote(17);

		Eleve e2=new Eleve();
		e2.setNom("Alae");
		e2.ajouterNote(15);
		e2.ajouterNote(14);
		e2.ajouterNote(19);

		Eleve e3=new Eleve();
		e3.setNom("Bahija");
		e3.ajouterNote(13);
		e3.ajouterNote(10);
		e3.ajouterNote(18);

		Eleve e4=new Eleve();
		
		e4.setNom("Ayoub");
		e4.ajouterNote(15);
		e4.ajouterNote(17);
		e4.ajouterNote(20);
		
		GroupeEleves g=new GroupeEleves();
		g.ajouterEleve(e);
		g.ajouterEleve(e2);
		g.ajouterEleve(e3);
		g.ajouterEleve(e4);
		//System.out.println(g.chercher("Wissal"));
		//g.lister();
		
		
		//System.out.println(e3.compareTo(e));
		System.out.println(g.meilleurEleve());
		g.trierEleves();
		g.lister();
	}

}
