package EX2;


public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		/*Compteur N=new Compteur("TA", 12);
		N.start();*/
		
		Compteur[] comp= {
				new Compteur("Wissal"),
				new Compteur("Ayoub"),
				new Compteur("Alae"),
				new Compteur("Yassine")
			};
			for(int i=0;i<comp.length;i++) {
				comp[i].start();
			}
			
	}
	

}
