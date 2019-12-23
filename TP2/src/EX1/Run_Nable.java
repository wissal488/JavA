package EX1;

public class Run_Nable implements Runnable{


		int valeur;
		Run_Nable(int val){
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
			if(valeur!=1 && valeur!=1000){
				System.out.println("Le nombre sasit n'est pas correct.\nSaisit soit 1 ou 1000!!!!");
			}
		}
		public static void main(String[] args) {

			Runnable TA =new Run_Nable(1);
			Runnable TB =new Run_Nable(1000);
			new Thread(TA).start();
			new Thread(TB).start();
			
		}

	}

